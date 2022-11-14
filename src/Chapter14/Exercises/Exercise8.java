package Chapter14.Exercises;

import java.lang.reflect.InvocationTargetException;

/**
 * 8. Напишите метод, который получает объект и рекурсивно выводит все классы в иерархии этого объекта.
 * date: 14.11.2022
 */
class Grandfather {}
class Father extends Grandfather {}
class Son extends Father {}

public class Exercise8 {
    public static void printHierarchy (Object obj) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {
        Class c = obj.getClass();
        Object object = new Object();

        if (!c.isInstance(object)) {
            System.out.println(c.getCanonicalName());
            printHierarchy(c.getSuperclass().getDeclaredConstructor().newInstance());
        }
    }

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException,
            NoSuchMethodException {
        printHierarchy(new Son());
    }
}