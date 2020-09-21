package Chapter3.Exercises;

import static net.mindview.util.Print.*;

/**
 * 11. Начните с числа, содержащего двоичную 1 в старшем бите (подсказка: воспользуйтесь шестнадцатеричной константой).
 * Используя знаковый оператор сдвига вправо, сдвигайте знак до крайней правой позиции, с выводом всех промежуточных
 * результатов методом Integer.toBinaryString().
 * date: 07.09.2020
 */
public class Exercise11 {
    public static void main(String[] args) {
        int i = 0x80;
        print("int: " + i + "; двоичное: " + Integer.toBinaryString(i));
        while (i != 0x1) {
            i >>= 1;
            print("int: " + i + "; двоичное: " + Integer.toBinaryString(i));
        }
    }
}