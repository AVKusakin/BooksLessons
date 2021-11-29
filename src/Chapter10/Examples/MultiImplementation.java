package Chapter10.Examples;

//: innerclasses/MultiImplementation.java
// При использовании конкретных или абстрактных классов
// внутренние классы предоставляют единственный способ
// провести "множественное наследование реализации".

class D {}
abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {};
    }
}

public class MultiImplementation {
    static void takeD(D d) {}
    static void takeE(E e) {}
    public static void main(String[] args) {
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());
    }
} ///:~