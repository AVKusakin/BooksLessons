package Chapter3.Exercises;

import static net.mindview.util.Print.*;

/**
 * 2. Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.
 * date: 06.09.2020
 */

class AliasingDemonstration{
    float variable;
}

public class SecondExcercise {

    public static void main(String[] args) {
        AliasingDemonstration a1 = new AliasingDemonstration();
        AliasingDemonstration a2 = new AliasingDemonstration();
        a1.variable = 4.57f;
        a2.variable = 63.421f;
        print("1: a1.variable: " + a1.variable + ", a2.variable: " + a2.variable);
        a1 = a2;
        print("2: a1.variable: " + a1.variable + ", a2.variable: " + a2.variable);
        a1.variable = 513.348f;
        print("3: a1.variable: " + a1.variable + ", a2.variable: " + a2.variable);
    }
}
