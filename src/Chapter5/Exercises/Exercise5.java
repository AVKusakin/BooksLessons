package Chapter5.Exercises;

import static net.mindview.util.Print.*;

/**
 * 5. Создайте класс Dog(собака) с перегруженным методом bark()(лай). Метод должен быть перегружен для разных
 * примитивных типов данных с целью вывода сообщения о лае, завывании, поскуливании и т.п. в зависимости от версии
 * перегруженного метода. Напишите метод main(), вызывающий все версии.
 * date: 16.09.2020
 */
class Dog {
    void bark(boolean x) {
        print("мотание головой");
    }
    void bark(char x) {
        print("писк");
    }
    void bark(byte x) {
        print("поскуливание");
    }
    void bark(short x) {
        print("завывание");
    }
    void bark(int x) {
        print("лай");
    }
    void bark(long x) {
        print("рык");
    }
    void bark(float x) {
        print("вой");
    }
    void bark(double x) {
        print("голос из преисподней");
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        Dog jack = new Dog();
        jack.bark(5);
        jack.bark(5l);
        jack.bark('x');
        jack.bark(true);
        jack.bark(5.0f);
        jack.bark((short) 5);
        jack.bark(5.0);
        jack.bark((byte) 5);
    }
}