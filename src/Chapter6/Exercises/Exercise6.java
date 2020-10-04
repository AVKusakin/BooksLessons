package Chapter6.Exercises;

/**
 * 6. Создайте класс с защищенными данными. Создайте в том же файле второй класс с методом, работающим с защищенными
 * данными из первого класса.
 * date: 04.10.2020
 */
class ForExercise6 {
    protected static int i = 5;
}

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(ForExercise6.i);
    }
}