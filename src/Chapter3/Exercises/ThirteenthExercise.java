package Chapter3.Exercises;

import static net.mindview.util.Print.*;

/**
 * 13. Напишите метод для вывода char в двочином представлении. Продемонстрируйте его работу на нескольких разных
 * символах.
 * date: 10.09.2020
 */
public class ThirteenthExercise {
    public static String charToBinaryString(char c) {
        return Integer.toBinaryString((int)c);
    }

    public static void main(String[] args) {
        print(charToBinaryString('a'));
        print(charToBinaryString('0'));
        print(charToBinaryString('/'));
        print(charToBinaryString('\n'));
    }
}