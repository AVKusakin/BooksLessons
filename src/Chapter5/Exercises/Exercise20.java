package Chapter5.Exercises;

/**
 * 20. Напишите метод main(), использующий список аргументов переменной длины вместо обычного синтаксиса. Выведите все
 * элементы полученного массива args. Протестируйте программу с разным количеством аргументов командной строки.
 * date: 03.10.2020
 */
class ForTwentiethExercise {
    public static void main(String... args) {
        for (String s: args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

public class Exercise20 {
    public static void main(String[] args) {
        String[] s = {"This", "is", "the", "first", "variant."};
        ForTwentiethExercise.main(s);
        ForTwentiethExercise.main("This", "is", "the", "second", "variant.");
        ForTwentiethExercise.main("And", "also", "third.");

    }
}