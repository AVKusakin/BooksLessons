package Chapter8.Exercises;

/**
 * 12. Измените упражнение 9 так, чтобы программа демонстрировала порядок инициализации базовых и производных классов.
 * Включите встроенные объекты и в базовые, и в производные классы, и покажите, в каком порядке проходит их инициализация
 * при конструировании объекта.
 * @see Chapter8.Exercises.Exercise9
 * date: 14.10.2020
 */
class Teeth {
    Teeth(String s) {
        System.out.println("This is the " + s + "'s teeth.");
    }
}

class Paws {
    Paws(String s) {System.out.println("This is the " + s + "'s paws.");}
}

class Rodent2 {
    private Teeth t = new Teeth("Rodent");
    private Paws p = new Paws("Rodent");
    public void run() {
        System.out.println("Rodent is running.");
    }
    public void gnaw() {
        System.out.println("Rodent is gnawing.");
    }
    public void sleep() {
        System.out.println("Rodent is sleeping.");
    }
    Rodent2() {
        System.out.println("This is the Rodent.");
    }
}

class Mouse2 extends Rodent2 {
    private Teeth t = new Teeth("Mouse");
    private Paws p = new Paws("Mouse");
    public void run() {
        System.out.println("Mouse is running.");
    }
    public void gnaw() {
        System.out.println("Mouse is gnawing.");
    }
    public void sleep() {
        System.out.println("Mouse is sleeping.");
    }
    Mouse2() {System.out.println("This is the Mouse.");}
}

class Hamster2 extends Rodent2 {
    private Teeth t = new Teeth("Hamster");
    private Paws p = new Paws("Hamster");
    public void run() {
        System.out.println("Hamster is running.");
    }
    public void gnaw() {
        System.out.println("Hamster is gnawing.");
    }
    public void sleep() {
        System.out.println("Hamster is sleeping.");
    }
    Hamster2() {System.out.println("This is the Hamster.");}
}

class Squirrel2 extends Rodent2 {
    private Teeth t = new Teeth("Squirrel");
    private Paws p = new Paws("Squirrel");
    public void run() {
        System.out.println("Squirrel is running.");
    }
    public void gnaw() {
        System.out.println("Squirrel is gnawing.");
    }
    public void sleep() {
        System.out.println("Squirrel is sleeping.");
    }
    Squirrel2() {System.out.println("This is the Squirrel.");}
}

class Beaver2 extends Rodent2 {
    private Teeth t = new Teeth("Beaver");
    private Paws p = new Paws("Beaver");
    public void run() {
        System.out.println("Beaver is running.");
    }
    public void gnaw() {
        System.out.println("Beaver is gnawing.");
    }
    public void sleep() {
        System.out.println("Beaver is sleeping.");
    }
    Beaver2() {System.out.println("This is the Beaver.");}
}

class Capybara2 extends Rodent2 {
    private Teeth t = new Teeth("Capybara");
    private Paws p = new Paws("Capybara");
    public void run() {
        System.out.println("Capybara is running.");
    }
    public void gnaw() {
        System.out.println("Capybara is gnawing.");
    }
    public void sleep() {
        System.out.println("Capybara is sleeping.");
    }
    Capybara2() {System.out.println("This is the Capybara.");}
}

public class Exercise12 {
    public static void main(String[] args) {
        Mouse2 mouse = new Mouse2();
        System.out.println();
        Squirrel2 squirrel = new Squirrel2();
        System.out.println();
        Hamster2 hamster = new Hamster2();
        System.out.println();
        Capybara2 capybara = new Capybara2();
        System.out.println();
        Beaver2 beaver = new Beaver2();
    }
}