package Chapter7.Exercises;

/**
 * 12. Включите иерархию методов dispose() во все классы из упражнения 9.
 * @see Chapter7.Exercises.Exercise9
 * date: 08.10.2020
 */
class Component13 {
    public Component13() {
        System.out.println("Component13 constructor");
    }
    void dispose() {
        System.out.println("dispose from Component13 object");
    }
}

class Component23 {
    public Component23() {
        System.out.println("Component23 constructor");
    }
    void dispose() {
        System.out.println("dispose from Component23 object");
    }
}

class Component33 {
    public Component33() {
        System.out.println("Component33 constructor");
    }
    void dispose() {
        System.out.println("dispose from Component33 object");
    }
}

class Root3 {
    private Component13 component13 = new Component13();
    private Component23 component23 = new Component23();
    private Component33 component33 = new Component33();
    public Root3() {
        System.out.println("Root3 constructor");
    }
    void dispose() {
        component33.dispose();
        component23.dispose();
        component13.dispose();
        System.out.println("dispose from Root3 object");
    }
}

class Stem3 extends Root3 {
    private Component13 component13 = new Component13();
    private Component23 component23 = new Component23();
    private Component33 component33 = new Component33();
    public Stem3() {
        System.out.println("Stem3 constructor");
    }
    void dispose() {
        component33.dispose();
        component23.dispose();
        component13.dispose();
        System.out.println("dispose from Stem3 object");
        super.dispose();
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        Stem3 stem3 = new Stem3();
        stem3.dispose();
    }
}