package Chapter4.Exercises;

import static net.mindview.util.Print.*;

/**
 * 5. Повторите упражнение 10 из предыдущей главы, используя тернарный оператор и поразрядную проверку для вывода
 * нулей и единиц (вместо вызова метода Integer.toBinaryString()).
 * date: 12.09.2020
 */
public class FifthExercise {
    static String toBinaryString(int x) {
        StringBuilder binaryString = new StringBuilder();
        while (x > 1) {
            int i = x % 2 == 0 ? 0 : 1;
            binaryString.append(i);
//            binaryString.append(x % 2); - можно обойтись и без тернарного оператора
            x /= 2;
        }
        binaryString.append(x);
        return binaryString.reverse().toString();
    }
    public static void main(String[] args) {
        int i1 = 0XAA;
        int i2 = 0X55;
        print("Первая константа: " + toBinaryString(i1));
        print("Вторая константа: " + toBinaryString(i2));
        System.out.println("Результат операции с поразрядным оператором И: " + toBinaryString(i1 & i2));
        System.out.println("Результат операции с поразрядным оператором ИЛИ: " + toBinaryString(i1 | i2));
        System.out.println("Результат операции с поразрядным оператором ИСКЛЮЧАЮЩЕЕ ИЛИ: " + toBinaryString(i1 ^ i2));
    }
}