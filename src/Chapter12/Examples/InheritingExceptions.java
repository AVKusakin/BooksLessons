package Chapter12.Examples;

//: exceptions/InheritingExceptions.java
// Создание собственного исключения.
import com.bruceeckel.simpletest.*;

class SimpleException extends Exception {}

public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Возбуждаем SimpleException из f()");
        throw new SimpleException();
    }
    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Перехвачено!");
        }
    }
} /* Output:
Возбуждаем SimpleException из f()
Перехвачено!
*///:~