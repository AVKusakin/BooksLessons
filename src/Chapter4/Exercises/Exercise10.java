package Chapter4.Exercises;

import java.util.*;

/**
 * 10. Вампирами называются числа, состоящие из четного количества цифр и полученные перемножением пары чисел (клыков),
 * каждое из которых содержит половину цифр результата. Цифры берутся из исходного числа в произвольном порядке, если
 * в одном из клыков последняя цифра ноль, то второй оканчиваться нулём не может. Примеры:
 * 1) 1260 = 21 * 60;
 * 2) 1827 = 21 * 87;
 * 3) 2187 = 27 * 81.
 * Напишите программу, которая находит всех «вампиров», состоящих из 4 цифр.
 * (Задача предложена Дэном Форханом.)
 * date: 13.09.2020
 */
public class Exercise10 {
    public static void main(String[] args) {
        String result;
        Set results = new HashSet();
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                result = new Integer(i * j).toString();
                if (result.length() == 4) {
                    char[] numeralsCharArray = (new Integer(i).toString() + new Integer(j).toString()).toCharArray();
                    char[] resultCharArray = result.toCharArray();
                    Arrays.sort(numeralsCharArray);
                    Arrays.sort(resultCharArray);
                    int count = 0;
                    for (int k = 0; k < 4; k++){
                        if (numeralsCharArray[k] == resultCharArray[k]) {
                            count++;
                        }
                    }
                    if (count == 4) {
                        if (!results.contains(i * j)) {
                            System.out.println("i = " + i + "; j = " + j + "; i * j = " + i * j);
                        }
                        results.add(i * j);
                    }
                }
            }
        }
    }
}