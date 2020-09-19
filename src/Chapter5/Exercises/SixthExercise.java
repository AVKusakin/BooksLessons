package Chapter5.Exercises;

import static net.mindview.util.Print.*;

/**
 * 6. Измените предыдущее упражнение так, чтобы два перегруженных метода принимали два аргумента (разных типов) и
 * отличались только порядком их следования всписке аргументов. Проверьте, работает ли это.
 * @see Chapter5.Exercises.FifthExercise
 * date: 19.09.2020
 */
class Dog2 {
    void bark(boolean x) {
        print("мотание головой");
    }
    void bark(char x, int i) {
        print("писк");
    }
    void bark(int i, char x) {
        print("лай");
    }
    void bark(byte x) {
        print("поскуливание");
    }
    void bark(short x) {
        print("завывание");
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

public class SixthExercise {
    public static void main(String[] args) {
        Dog2 jack = new Dog2();
        jack.bark(8, 'x');
        jack.bark('x', 8);
        jack.bark(8l);
        jack.bark(true);
        jack.bark(8.0f);
        jack.bark((short) 8);
        jack.bark(8.0);
        jack.bark((byte) 8);
    }
}