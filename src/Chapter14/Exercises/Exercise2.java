package Chapter14.Exercises;

import static net.mindview.util.Print.*;

/**
 * 2. Встройте новый интерфейс в ToyTest.java. Убедитесь в том, что он обнаруживается, а информация о нем выводится
 * программой.
 * @see Chapter14.Examples.toys.ToyTest
 * date: 10.11.2022
 */
interface HasBatteries2 {}

interface Waterproof2 {}

interface Shoots2 {}

interface Weight {}

class Toy2 {
    Toy2() {}
    Toy2(int i) {}
}

class FancyToy2 extends Toy2 implements HasBatteries2, Waterproof2, Shoots2, Weight {
    FancyToy2() {
        super(1);
    }
}

public class Exercise2 {
    static void printInfo(Class cc) {
        print("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        print("Простое имя: " + cc.getSimpleName());
        print("Каноническое имя: " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Chapter14.Exercises.FancyToy2");
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
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Не удалось создать экземпляр");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Отказано в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}