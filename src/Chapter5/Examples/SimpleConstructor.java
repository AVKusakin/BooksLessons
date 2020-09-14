package Chapter5.Examples;

//: initialization/SimpleConstructor.java
// Демонстрация простого конструктора.

class Rock {
    Rock() { // Это и есть конструктор
        System.out.print("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
} /* Output:
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
*///:~