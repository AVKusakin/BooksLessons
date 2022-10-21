package Chapter12.Exercises;

import static net.mindview.util.Print.*;

/**
 * 17. Измените пример polymorphism/Frog.java, чтобы он использовал try-finally для обеспечения необходимых завершающих 
 * действий. Покажите, что программа работает даже при возврате из середины try-finally.
 * @see Chapter8.Examples.Frog
 * date: 21.10.2022
 */
class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        print("Создаем Characteristic " + s);
    }
    protected void dispose() {
        print("Завершаем Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        print("Создаем Description " + s);
    }
    protected void dispose() {
        print("Завершаем Description " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("живое существо");
    private Description t = new Description("обычное живое существо");
    LivingCreature() {
        print("LivingCreature");
    }
    protected void dispose() {
        print("dispose() в LivingCreature ");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("имеет сердце");
    private Description t = new Description("животное, не растение");
    Animal() {
        print("Animal()");
    }
    protected void dispose() {
        print("dispose() в Animal ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("может жить в воде");
    private Description t = new Description("и в воде, и на земле");
    Amphibian() {
        print("Amphibian()");
    }
    protected void dispose() {
        print("dispose() в Amphibian ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Exercise17 extends Amphibian {
    private Characteristic p = new Characteristic("квакает");
    private Description t = new Description("ест жуков");
    Exercise17() {
        print("Exercise17()");
    }
    protected void dispose() {
        print("dispose() в Exercise17 ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Exercise17 frog = new Exercise17();
        try {
            print("Пока!");
            return;
        } finally {
            print("Точно пока!");
            frog.dispose();
        }
    }
}