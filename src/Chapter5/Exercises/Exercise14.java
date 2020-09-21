package Chapter5.Exercises;

import static net.mindview.util.Print.*;

/**
 * 14. Создайте класс с полем static String, инициализируемым в точке определения, и другим полем, инициализируемым в
 * блоке static. Добавьте статический метод, который выводит значения полей и демонстрирует, что оба поля
 * инициализируются перед использованием.
 * date: 21.09.2020
 */
public class Exercise14 {
    public static void main(String[] args) {
        f();
    }
    static void f() {
        print("s = " + s + " i = " + i);
    }
    static String s = new String();
    static int i;
    static {
        i = 28;
    }
}