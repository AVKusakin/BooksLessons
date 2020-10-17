package Chapter8.Exercises;

import static net.mindview.util.Print.*;

/**
 * 14. Измените упражнение 12 так, чтобы один из встроенных объектов был общим и для него использовался подсчет ссылок.
 * Покажите, что он правильно работает.
 * @see Chapter8.Exercises.Exercise12
 * date: 17.10.2020
 */
class Teeth2 {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;
    Teeth2() {
        System.out.println("This is the Teeth " + id + ".");
    }
    public void addRef() {
        refCount++;
    }
    protected void dispose() {
        if (--refCount == 0)
            print("Disposing" + this);
    }
    public String toString() {
        return "Teeth " + id;
    }
}

class Paws2 {
    Paws2(String s) {System.out.println("This is the " + s + "'s paws.");}
}

class Rodent3 {
    private Paws2 p = new Paws2("Rodent");
    public void run() {
        System.out.println("Rodent is running.");
    }
    public void gnaw() {
        System.out.println("Rodent is gnawing.");
    }
    public void sleep() {
        System.out.println("Rodent is sleeping.");
    }
    Rodent3() {
        System.out.println("This is the Rodent.");
    }
    protected void dispose() {
        print("Disposing" + this);
    }
    public String toString() {
        return "Rodent";
    }
}

class Mouse3 extends Rodent3 {
    private Teeth2 t;
    private Paws2 p = new Paws2("Mouse");
    public void run() {
        System.out.println("Mouse is running.");
    }
    public void gnaw() {
        System.out.println("Mouse is gnawing.");
    }
    public void sleep() {
        System.out.println("Mouse is sleeping.");
    }
    Mouse3(Teeth2 t) {
        System.out.println("This is the Mouse.");
        this.t = t;
        this.t.addRef();
    }
    protected void dispose() {
        print("Disposing" + this);
        t.dispose();
    }
    public String toString() {
        return "Mouse";
    }
}

class Hamster3 extends Rodent3 {
    private Teeth2 t;
    private Paws2 p = new Paws2("Hamster");
    public void run() {
        System.out.println("Hamster is running.");
    }
    public void gnaw() {
        System.out.println("Hamster is gnawing.");
    }
    public void sleep() {
        System.out.println("Hamster is sleeping.");
    }
    Hamster3(Teeth2 t) {
        System.out.println("This is the Hamster.");
        this.t = t;
        this.t.addRef();
    }
    protected void dispose() {
        print("Disposing" + this);
        t.dispose();
    }
    public String toString() {
        return "Hamster";
    }
}

class Squirrel3 extends Rodent3 {
    private Teeth2 t;
    private Paws2 p = new Paws2("Squirrel");
    public void run() {
        System.out.println("Squirrel is running.");
    }
    public void gnaw() {
        System.out.println("Squirrel is gnawing.");
    }
    public void sleep() {
        System.out.println("Squirrel is sleeping.");
    }
    Squirrel3(Teeth2 t) {
        System.out.println("This is the Squirrel.");
        this.t = t;
        this.t.addRef();
    }
    protected void dispose() {
        print("Disposing" + this);
        t.dispose();
    }
    public String toString() {
        return "Squirrel";
    }
}

class Beaver3 extends Rodent3 {
    private Teeth2 t;
    private Paws2 p = new Paws2("Beaver");
    public void run() {
        System.out.println("Beaver is running.");
    }
    public void gnaw() {
        System.out.println("Beaver is gnawing.");
    }
    public void sleep() {
        System.out.println("Beaver is sleeping.");
    }
    Beaver3(Teeth2 t) {
        System.out.println("This is the Beaver.");
        this.t = t;
        this.t.addRef();
    }
    protected void dispose() {
        print("Disposing" + this);
        t.dispose();
    }
    public String toString() {
        return "Beaver";
    }
}

class Capybara3 extends Rodent3 {
    private Teeth2 t;
    private Paws2 p = new Paws2("Capybara");
    public void run() {
        System.out.println("Capybara is running.");
    }
    public void gnaw() {
        System.out.println("Capybara is gnawing.");
    }
    public void sleep() {
        System.out.println("Capybara is sleeping.");
    }
    Capybara3(Teeth2 t) {
        System.out.println("This is the Capybara.");
        this.t = t;
        this.t.addRef();
    }
    protected void dispose() {
        print("Disposing" + this);
        t.dispose();
    }
    public String toString() {
        return "Capybara";
    }
}

public class Exercise14 {
    public static void main(String[] args) {
        Teeth2 t = new Teeth2();
        Mouse3 mouse = new Mouse3(t);
        System.out.println();
        Squirrel3 squirrel = new Squirrel3(t);
        System.out.println();
        Hamster3 hamster = new Hamster3(t);
        System.out.println();
        Capybara3 capybara = new Capybara3(t);
        System.out.println();
        Beaver3 beaver = new Beaver3(t);
        beaver.dispose();
        capybara.dispose();
        hamster.dispose();
        squirrel.dispose();
        mouse.dispose();
    }
}