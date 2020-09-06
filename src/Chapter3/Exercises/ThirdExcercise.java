package Chapter3.Exercises;

import static net.mindview.util.Print.*;

/**
 * 3. Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен при вызове методов.
 * date: 06.09.2020
 */

class AliasingInMethodsDemonstration{
    float variable;
}

public class ThirdExcercise {

    static void f(AliasingInMethodsDemonstration am) {
        am.variable = 5.79f;
    }
    public static void main(String[] args) {
        AliasingInMethodsDemonstration x = new AliasingInMethodsDemonstration();
        x.variable = 7.13f;
        print("1: x.variable: " + x.variable);
        f(x);
        print("2: x.variable: " + x.variable);
    }
}
