package Chapter12.Examples;

//: exceptions/TurnOffChecking.java
// "Отключение" контролируемых исключений.
import java.io.*;
import static net.mindview.util.Print.*;

class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("Где я?");
                default: return;
            }
        } catch (Exception e) { // Превращаем в неконтролируемое:
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {}

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        // Вы можете вызвать f() без блока try и позволить
        // исключению RuntimeException покинуть метод:
        wce.throwRuntimeException(3);
        // Или перехватить исключения:
        for (int i = 0; i < 4; i++)
            try {
                if (i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            } catch (SomeOtherException e) {
                print("SomeOtherException: " + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    print("FileNotFoundException: " + e);
                } catch (IOException e) {
                    print("IOException: " + e);
                } catch (Throwable e) {
                    print("Throwable: " + e);
                }
            }
    }
} /* Output:
FileNotFoundException: java.io.FileNotFoundException
IOException: java.io.IOException
Throwable: java.lang.RuntimeException: Где я?
SomeOtherException: Chapter12.Examples.SomeOtherException
*///:~