package Chapter3.Exercises;

import static net.mindview.util.Print.*;

/**
 * 12. Начните с числа, состоящего из двоичных единиц. Сдвиньте его влево, а затем используйте беззнаковый оператор
 * сдвига вправо по всем двоичным позициям, с выводом всех промежуточных результатов методом Integer.toBinaryString().
 * date: 07.09.2020
 */
public class Exercise12 {
    public static void main(String[] args) {
        int i = 0xff;
        print("int: " + i + "; двоичное: " + Integer.toBinaryString(i));
        i <<= 8;
        print("int: " + i + "; двоичное: " + Integer.toBinaryString(i));
        while (i != 0x1) {
            i >>>= 1;
            print("int: " + i + "; двоичное: " + Integer.toBinaryString(i));
        }
    }
}