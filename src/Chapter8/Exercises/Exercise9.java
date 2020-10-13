package Chapter8.Exercises;

/**
 * 9. Создайте иерархию наследования, используя в качестве основы различные типы грызунов. Базовым классом станет Rodent
 * (грызун), а производными классами будут Mouse (мышь), Hamster (хомяк) и т.п. В базовом классе определите несколько
 * общих методов, которые затем переопределите в производных классах, для того чтобы они производили действие,
 * свойственное конкретному типу объекта. Создайте массив из объектов Rodent, заполните его различными производными
 * типами и вызовите методы базового класса, чтобы увидеть результат работы программы.
 * date: 13.10.2020
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

public class Exercise9 {
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
                new Mouse(),
                new Beaver(),
                new Capybara(),
                new Beaver(),
                new Squirrel(),
                new Mouse(),
                new Capybara(),
                new Hamster()
        };

        for (Rodent rodent : rodents) {
            rodent.run();
            rodent.gnaw();
            rodent.sleep();
        }
    }
}