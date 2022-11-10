package Chapter14.Examples.toys;

//: typeinfo/toys/ToyTest.java

// Тестировние класса Class.
import static net.mindview.util.Print.*;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    // Закомментируйте следующий конструктор по умолчанию, чтобы увидеть ошибку NoSuchMethodError из (*1*)
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {super(1);}
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        print("Простое имя: " + cc.getSimpleName());
        print("Каноническое имя: " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Chapter14.Examples.toys.FancyToy");
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
            // Необходим конструктор по умолчанию:
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
} /* Output:
Имя класса: Chapter14.Examples.toys.FancyToy является интерфейсом? [false]
Простое имя: FancyToy
Каноническое имя: Chapter14.Examples.toys.FancyToy
Имя класса: Chapter14.Examples.toys.HasBatteries является интерфейсом? [true]
Простое имя: HasBatteries
Каноническое имя: Chapter14.Examples.toys.HasBatteries
Имя класса: Chapter14.Examples.toys.Waterproof является интерфейсом? [true]
Простое имя: Waterproof
Каноническое имя: Chapter14.Examples.toys.Waterproof
Имя класса: Chapter14.Examples.toys.Shoots является интерфейсом? [true]
Простое имя: Shoots
Каноническое имя: Chapter14.Examples.toys.Shoots
Имя класса: Chapter14.Examples.toys.Toy является интерфейсом? [false]
Простое имя: Toy
Каноническое имя: Chapter14.Examples.toys.Toy
*///:~