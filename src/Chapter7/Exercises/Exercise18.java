package Chapter7.Exercises;

import java.util.*;

/**
 * 18. Создайте класс, содержащий два поля: static final и final. Продемонтсрируйте различия между ними.
 * date: 09.10.2020
 */
public class Exercise18 {
    static Random rand = new Random(47);
    static final int VALUE_ONE = rand.nextInt(100);
    final int valueTwo = rand.nextInt(100);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Exercise18 x = new Exercise18();
            System.out.println("VALUE_ONE = " + x.VALUE_ONE + "; valueTwo = " + x.valueTwo);
        }
    }
}