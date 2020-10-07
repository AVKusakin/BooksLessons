package Chapter7.Exercises;

/**
 * 10. Измените предыдущее упражнение так, чтобы во всех классах присутствовали лишь конструкторы с аргументами (не по
 * умолчанию).
 * @see Chapter7.Exercises.Exercise9
 * date: 07.10.2020
 */
class Component12 {
    public Component12(String s) {
        System.out.println("Component12 constructor " + s);
    }
}

class Component22 {
    public Component22(String s) {
        System.out.println("Component22 constructor " + s);
    }
}

class Component32 {
    public Component32(String s) {
        System.out.println("Component32 constructor " + s);
    }
}

class Root2 {
    private Component12 component12 = new Component12("String");
    private Component22 component22 = new Component22("String");
    private Component32 component32 = new Component32("String");
    public Root2(String s) {
        System.out.println("Root2 constructor " + s);
    }
}

class Stem2 extends Root2 {
    private Component12 component12 = new Component12("String");
    private Component22 component22 = new Component22("String");
    private Component32 component32 = new Component32("String");
    public Stem2(String s) {
        super(s);
        System.out.println("Stem2 constructor " + s);
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        Stem2 stem2 = new Stem2("String");
    }
}