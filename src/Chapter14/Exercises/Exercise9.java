package Chapter14.Exercises;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 9. Измените предыдущее упражнение так, чтобы в нем использовался метод Class.getDeclaredFields() для вывода информации
 * о полях класса.
 * @see Chapter14.Exercises.Exercise8
 * date: 14.11.2022
 */
class Grandfather2 {
    public String name;
    public Integer age;
    public String maritalStatus;
}
class Father2 extends Grandfather2 {
    public Integer height;
    public Integer weight;
    public String education;
    public String politicalBeliefs;
}
class Son2 extends Father2 {
    public Integer toysCount;
    public Double schoolAverageRating;
    public Integer friendsCount;
    public String hobbies;
}

public class Exercise9 {
    public static void printHierarchy (Object obj) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {
        Class c = obj.getClass();
        Object object = new Object();

        if (!c.isInstance(object)) {
            System.out.println(c.getCanonicalName());
            Field[] fields = c.getDeclaredFields();
            if (fields != null && fields.length > 0)
                for (Field field : fields) {
                    System.out.println(field);
                }
            System.out.println();
            printHierarchy(c.getSuperclass().getDeclaredConstructor().newInstance());
        }
    }

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException,
            NoSuchMethodException {
        printHierarchy(new Son2());
    }
}