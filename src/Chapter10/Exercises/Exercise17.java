package Chapter10.Exercises;

import java.util.Random;

/**
 * 17. Измените решение упражнения 19 из главы 9 так, чтобы в нём использовались анонимные внутренние классы.
 * @see Chapter9.Exercises.Exercise19
 * date: 11.09.2021
 */
interface Subject {
    int throwSubject();
}

interface SubjectFactory {
    Subject getSubject();
}

class Coin implements Subject {
    private Coin() {}
    public int throwSubject() {
        System.out.println("Coin Toss");
        return new Random().nextBoolean() == true ? 0 : 1;
    }
    public static SubjectFactory factory = new SubjectFactory() {
        public Subject getSubject() {
            return new Coin();
        }
    };
}

class Dice implements Subject {
    private Dice() {}
    public int throwSubject() {
        System.out.println("Dice Roll");
        return ((int) (Math.random() * 5)) + 1;
    }
    public static SubjectFactory factory = new SubjectFactory() {
        public Subject getSubject() {
            return new Dice();
        }
    };
}

public class Exercise17 {
    public static void throwSomething(SubjectFactory factory) {
        Subject subject = factory.getSubject();
        System.out.println("result: " + subject.throwSubject());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            throwSomething(Coin.factory);
            System.out.println();
            throwSomething(Dice.factory);
            System.out.println();
        }
    }
}