package Chapter2.Exercises;

/**
 * 7. Превратите фрагменты кода с классом Incrementable в работающую программу.
 * date: 15.02.2020
 */
public class SeventhExercise {

    static class StaticTest {
        static int i = 47;
    }

    static class Incrementable {
        static void increment() {
            StaticTest.i++;
        }
    }

    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println("The i = " + StaticTest.i + ".");
    }
}