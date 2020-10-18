package Chapter9.Exercises;

/**
 * 7. Измените упражнение 9 из главы 8 так, чтобы тип Rodent был оформлен как интерфейс.
 * @see Chapter8.Exercises.Exercise9
 * date: 18.10.2020
 */
interface Rodent2 {
    public void run();
    public void gnaw();
    public void sleep();
}

class Mouse2 implements Rodent2 {
    public void run() {
        System.out.println("Mouse is running.");
    }
    public void gnaw() {
        System.out.println("Mouse is gnawing.");
    }
    public void sleep() {
        System.out.println("Mouse is sleeping.");
    }
}

class Hamster2 implements Rodent2 {
    public void run() {
        System.out.println("Hamster is running.");
    }
    public void gnaw() {
        System.out.println("Hamster is gnawing.");
    }
    public void sleep() {
        System.out.println("Hamster is sleeping.");
    }
}

class Squirrel2 implements Rodent2 {
    public void run() {
        System.out.println("Squirrel is running.");
    }
    public void gnaw() {
        System.out.println("Squirrel is gnawing.");
    }
    public void sleep() {
        System.out.println("Squirrel is sleeping.");
    }
}

class Beaver2 implements Rodent2 {
    public void run() {
        System.out.println("Beaver is running.");
    }
    public void gnaw() {
        System.out.println("Beaver is gnawing.");
    }
    public void sleep() {
        System.out.println("Beaver is sleeping.");
    }
}

class Capybara2 implements Rodent2 {
    public void run() {
        System.out.println("Capybara is running.");
    }
    public void gnaw() {
        System.out.println("Capybara is gnawing.");
    }
    public void sleep() {
        System.out.println("Capybara is sleeping.");
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        Rodent2[] rodents = {
                new Mouse2(),
                new Squirrel2(),
                new Capybara2(),
                new Mouse2(),
                new Capybara2(),
                new Hamster2(),
                new Hamster2(),
                new Squirrel2(),
                new Beaver2(),
                new Mouse2(),
                new Beaver2(),
                new Capybara2(),
                new Beaver2(),
                new Squirrel2(),
                new Mouse2(),
                new Capybara2(),
                new Hamster2()
        };

        for (Rodent2 rodent : rodents) {
            rodent.run();
            rodent.gnaw();
            rodent.sleep();
        }
    }
}