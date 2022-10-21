package Chapter12.Examples;

//: exceptions/ExceptionSilencer.java

public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Использование 'return' в блоке finally
            // подавляет любое возбуждённое исключение.
            return;
        }
    }
} ///:~