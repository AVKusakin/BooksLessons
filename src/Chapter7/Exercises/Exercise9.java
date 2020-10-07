package Chapter7.Exercises;

/**
 * 9. Создайте класс Root, содержащий экземпляры каждого из классов (также созданных вами) Component1, Component2 и
 * Component3. Объявите класс Stem производным от класса Root, так чтобы в нем также содержались экземпляры каждого из
 * упомянутых классов Component. Каждый класс должен содержать конструктор по умолчанию, который выводит сообщение о
 * своем вызове.
 * date: 07.10.2020
 */
class Component1 {
    public Component1() {
        System.out.println("Component1 constructor");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2 constructor");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3 constructor");
    }
}

class Root {
    private Component1 component1 = new Component1();
    private Component2 component2 = new Component2();
    private Component3 component3 = new Component3();
    public Root() {
        System.out.println("Root constructor");
    }
}

class Stem extends Root {
    private Component1 component1 = new Component1();
    private Component2 component2 = new Component2();
    private Component3 component3 = new Component3();
    public Stem() {
        System.out.println("Stem constructor");
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}