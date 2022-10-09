package Chapter11.Exercises;

import java.util.*;

/**
 * 10. Измените упражнение 9 из главы 8, чтобы объекты Rodent хранились в контейнере ArrayList, а для перебора 
 * последовательности Rodent использовался итератор Iterator.
 * @see Chapter8.Exercises.Exercise9
 * date: 09.10.2022
 */
class Rodent {
    public void run() {
        System.out.println("Rodent is running.");
    }
    public void gnaw() {
        System.out.println("Rodent is gnawing.");
    }
    public void sleep() {
        System.out.println("Rodent is sleeping.");
    }
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

public class Exercise10 {
    public static void main(String[] args) {
        List<Rodent> rodents = Arrays.asList(
                new Mouse(),
                new Squirrel(),
                new Capybara(),
                new Mouse(),
                new Capybara(),
                new Hamster(),
                new Hamster(),
                new Squirrel(),
                new Beaver(),
                new Mouse(),
                new Beaver(),
                new Capybara(),
                new Beaver(),
                new Squirrel(),
                new Mouse(),
                new Capybara(),
                new Hamster()
        );

        Iterator<Rodent> it = rodents.iterator();
        while (it.hasNext()) {
            Rodent rodent = it.next();
            rodent.run();
            rodent.gnaw();
            rodent.sleep();
        }
    }
}