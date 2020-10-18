package Chapter9.Exercises;

import static net.mindview.util.Print.*;

/**
 * 8. В программе Sandwich.java из главы 8 создайте интерфейс с именем FastFood (с подходящими методами); измените класс
 * Sandwich так, чтобы он реализовал этот интерфейс.
 * @see Chapter8.Examples.Sandwich
 * date: 18.10.2020
 */
interface FastFood {
    void beDone();
    void beEaten();
    void beThrownOut();
    void beShat();
}

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

class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() {
        print("Sandwich()");
    }

    @Override
    public void beDone() {
        print("Sandwich is done.");
    }

    @Override
    public void beEaten() {
        print("Sandwich is eaten.");
    }

    @Override
    public void beThrownOut() {
        print("Sandwich is thrown out.");
    }

    @Override
    public void beShat() {
        print("Sandwich is shat.");
    }
}


public class Exercise8 {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.beDone();
        sandwich.beEaten();
        sandwich.beShat();
        sandwich.beThrownOut();
    }
}