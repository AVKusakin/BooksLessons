package Chapter3.Exercises;

import static net.mindview.util.Print.*;

/**
 * 10. Напишите программу с двумя константами: обе константы состоят из чередующихся нулей и единиц, но у одной нулю
 * равен младший бит, а у другой - старший (подсказка: константы проще всего определить в шестнадцатеричном виде).
 * Объедините эти две константы всеми возможными поразрядными операторами. Для вывода результатов используйте метод
 * Integer.toBinaryString().
 * date: 07.09.2020
 */
public class Exercise10 {
    public static void main(String[] args) {
        int i1 = 0XAA;
        int i2 = 0X55;
        print("Первая константа: " + Integer.toBinaryString(i1));
        print("Вторая константа: " + Integer.toBinaryString(i2));
        System.out.println("Результат операции с поразрядным оператором И: " + Integer.toBinaryString(i1 & i2));
        System.out.println("Результат операции с поразрядным оператором ИЛИ: " + Integer.toBinaryString(i1 | i2));
        System.out.println("Результат операции с поразрядным оператором ИСКЛЮЧАЮЩЕЕ ИЛИ: " + Integer.toBinaryString(i1 ^ i2));
    }
}