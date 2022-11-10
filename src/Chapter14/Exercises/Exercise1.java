package Chapter14.Exercises;

import static net.mindview.util.Print.*;

/**
 * 1. В примере ToyTest.java закомментируйте конструктор Toy по умолчанию. Объясните, что при этом происходит.
 * @see Chapter14.Examples.toys.ToyTest
 * date: 10.11.2022
 */
interface HasBatteries {}

interface Waterproof {}

interface Shoots {}

class Toy {
    //    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class Exercise1 {
    static void printInfo(Class cc) {
        print("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        print("Простое имя: " + cc.getSimpleName());
        print("Каноническое имя: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Chapter14.Exercises.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Не удается найти FancyToy");
            System.exit(1);
        }
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
// Дело в том, что конструктор по умолчанию генерируется в классе автоматически только в том случае, если класс не содержит
// реализации других конструкторов. Если класс содержит реализацию хотя бы одного конструктора с параметрами, то, чтобы
// объявить конструктор по умолчанию, его нужно объявлять в классе явным образом. Если этого не сделать, то при попытке
// объявить объект класса с использованием конструктора по умолчанию будет выдана ошибка компиляции.