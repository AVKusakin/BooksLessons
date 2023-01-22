package Chapter14.Exercises;

import java.lang.reflect.InvocationTargetException;
import static net.mindview.util.Print.*;

/**
 * 19. В программе ToyTest.java используйте отражение для создания объекта Toy конструктором с аргументами.
 * @see Chapter14.Examples.toys.ToyTest
 * date: 22.01.2023
 */
interface HasBatteries3 {}
interface Waterproof3 {}
interface Shoots3 {}

class Toy3 {
    Toy3() {}
    Toy3(Integer i) {}
}

class FancyToy3 extends Toy3 implements HasBatteries3, Waterproof3, Shoots3 {
    FancyToy3() {super(1);}
}

public class Exercise19 {
    static void printInfo(Class cc) {
        print("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        print("Простое имя: " + cc.getSimpleName());
        print("Каноническое имя: " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Chapter14.Exercises.FancyToy3");
        } catch (ClassNotFoundException e) {
            print("Не удается найти FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.getDeclaredConstructor(new Class[]{Integer.class}).newInstance(1);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        printInfo(obj.getClass());
    }
}