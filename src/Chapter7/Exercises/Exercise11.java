package Chapter7.Exercises;

import static net.mindview.util.Print.*;

/**
 * 11. Измените пример Detergent.java так, чтобы в нём использовалось делегирование.
 * @see Chapter7.Examples.Detergent
 * date: 08.10.2020
 */
class Cleanser2 {
    private String s = "Cleanser2";
    public void append(String a) {
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }
    public String toString() {
        return s;
    }
    public static void main(String[] args) {
        Cleanser2 x = new Cleanser2();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}

class Detergent2 {
    private String s = "Detergent2";
    private Cleanser2 cleanser2 = new Cleanser2();
    public void append(String a) {
        cleanser2.append(a);
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" Detergent2.scrub()");
        cleanser2.scrub();
    }
    public void foam() {
        append(" foam()");
    }
    public String toString() {
        return s;
    }
    public static void main(String[] args) {
        Detergent2 x = new Detergent2();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x.cleanser2);
        print("Проверяем базовый класс");
        Cleanser2.main(args);
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        Detergent2.main(args);
    }
}