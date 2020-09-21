package Chapter4.Exercises;

import java.util.*;

/**
 * 2. Напишите программу, которая генерирует 25 случайных значений типа int. Для каждого значения команда if-else
 * сообщает, в каком отношении оно находится с другим случайно сгенерированным числом (больше, меньше, равно).
 * date: 12.09.2020
 */
public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            int x = new Random().nextInt();
            int y = new Random().nextInt();
            System.out.println("x = " + x + "; y = " + y);
            if (x > y) {
                System.out.println("x is bigger than y");
            } else if (x < y) {
                System.out.println("x is smaller than y");
            } else {
                System.out.println("x equals y");
            }
        }
    }
}