package Chapter4.Examples;

//: control/WhileTest.java
// Пример использования цикла while

public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
    }
}