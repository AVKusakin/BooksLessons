package Chapter4.Exercises;

import java.util.*;

/**
 * 4. Напишите программу, использующую два вложенных цикла for и оператор остатка (%) для поиска и вывода простых чисел
 * (то есть целых чисел, не делящихся нацело ни на какое другое число, кроме себя и 1).
 * date: 12.09.2020
 */
public class FourthExercise {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            List<Boolean> division = new ArrayList<>();
            for (int j = 1; j < 1000; j++) {
                if (i % j == 0) {
                    division.add(true);
                }
            }
            if (division.size() == 2) {
                System.out.println(i);
            }
        }
    }
}