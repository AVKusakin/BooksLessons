package Chapter3.Exercises;

import static net.mindview.util.Print.*;

/**
 * 8. Покажите, что шестнадцатеричная и восьмеричная записи могут использоваться с типом long. Для вывода результатов
 * используйте метод Long.toBinaryString().
 * date: 07.09.2020
 */
public class EithExercise {
    public static void main(String[] args) {
        long l1 = 0x2fl; // Шестнадцатиричная запись (суффикс 'l' не обязателен)
        print("l1: " + Long.toBinaryString(l1));
        long l2 = 0177l; // Восьмеричная запись
        print("l2: " + Long.toBinaryString(l2));
    }
}