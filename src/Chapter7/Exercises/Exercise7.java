package Chapter7.Exercises;

/**
 * 7. Измените упражнение 5 так, чтобы классы A и B имели конструкторы с аргументами вместо конструкторов по умолчанию.
 * Напишите конструктор для класса С и проведите всю необходимую инициализацию внутри него.
 * @see Chapter7.Exercises.Exercise5
 * date: 07.10.2020
 */
class A2 {
    public A2(int i) {
        System.out.println("A constructor");
    }
}

class B2 {
    public B2(int i) {
        System.out.println("B constructor");
    }
}

class C2 extends A2 {
    private B2 b = new B2(2);
    public C2(int i) {
        super(i);
        System.out.println("C constructor");
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        C2 c = new C2(3);
    }
}