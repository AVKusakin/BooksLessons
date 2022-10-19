package Chapter12.Examples;

//: exceptions/ExceptionMethods.java
// Демонстрация методов класса Exception.
import static net.mindview.util.Print.*;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("Моё исключение");
        } catch (Exception e) {
            print("Перехвачено");
            print("getMessage(): " + e.getMessage());
            print("getLocalizedMessage(): " + e.getLocalizedMessage());
            print("toString(): " + e);
            print("printStackTrace: ");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
Перехвачено
getMessage(): Моё исключение
getLocalizedMessage(): Моё исключение
toString(): java.lang.Exception: Моё исключение
printStackTrace:
java.lang.Exception: Моё исключение
	at Chapter12.Examples.ExceptionMethods.main(ExceptionMethods.java:10)
*///:~