package Chapter9.Exercises;

import java.util.*;

/**
 * 19. Создайте на базе паттерна «Фабричный метод» программную среду, моделирующую броски монет и броски кубиков.
 * date: 23.10.2020
 */
interface Subject {
    int throwSubject();
}

interface SubjectFactory {
    Subject getSubject();
}

class Coin implements Subject {
    public int throwSubject() {
        System.out.println("Coin Toss");
        return new Random().nextBoolean() == true ? 0 : 1;
    }
}

class CoinFactory implements SubjectFactory {
    public Subject getSubject() {
        return new Coin();
    }
}

class Dice implements Subject {
    public int throwSubject() {
        System.out.println("Dice Roll");
        return ((int) (Math.random() * 5)) + 1;
    }
}

class DiceFactory implements SubjectFactory {
    public Subject getSubject() {
        return new Dice();
    }
}

public class Exercise19 {
    public static void throwSomething(SubjectFactory factory) {
        Subject subject = factory.getSubject();
        System.out.println("result: " + subject.throwSubject());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            throwSomething(new CoinFactory());
            System.out.println();
            throwSomething(new DiceFactory());
            System.out.println();
        }
    }
}