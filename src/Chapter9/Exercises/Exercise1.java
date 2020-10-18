package Chapter9.Exercises;

/**
 * 1. Измените упражнение 9 из предыдущей главы так, чтобы класс Rodent стал абстрактным (abstract) классом. Сделайте
 * некоторые методы класса Rodent абстрактными (там, где это оправдано).
 * @see Chapter8.Exercises.Exercise9
 * date: 18.10.2020
 */
abstract class Rodent {
    public void run() {
        System.out.println("Rodent is running.");
    }
    abstract public void gnaw();
    abstract public void sleep();
}

class Mouse extends Rodent {
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

class Hamster extends Rodent {
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

class Squirrel extends Rodent {
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

class Beaver extends Rodent {
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

class Capybara extends Rodent {
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

public class Exercise1 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Squirrel(),
                new Capybara(),
                new Mouse(),
                new Capybara(),
                new Hamster(),
                new Hamster(),
                new Squirrel(),
                new Beaver(),
                new Mouse()
        };

        for (Rodent rodent : rodents) {
            rodent.run();
            rodent.gnaw();
            rodent.sleep();
        }
    }
}