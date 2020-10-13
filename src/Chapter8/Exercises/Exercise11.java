package Chapter8.Exercises;

import static net.mindview.util.Print.print;

/**
 * 11. Включите класс Pickle в программу Sandwich.java.
 * @see Chapter8.Examples.Sandwich
 * date: 13.10.2020
 */
class Meal {
    Meal() {
        print("Meal()");
    }
}

class Bread {
    Bread() {
        print("Bread()");
    }
}

class Cheese {
    Cheese() {
        print("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}

class Pickle {
    Pickle() {
        print("Pickle()");
    }
}

class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}

class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() {
        print("Sandwich()");
    }
    public static void main(String[] args) {
        new Sandwich();
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
    }
}