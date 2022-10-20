package Chapter12.Examples;

//: exceptions/AlwaysFinally.java
// Finally выполняется всегда.
import static net.mindview.util.Print.*;

class FourException extends Exception {}

public class AlwaysFinally {
    public static void main(String[] args) {
        print("Входим в первый блок try");
        try {
            print("Входим во второй блок try");
            try {
                throw new FourException();
            } finally {
                print("finally во втором блоке try");
            }
        } catch (FourException e) {
            System.out.println("Перехвачено FourException в первом блоке try");
        } finally {
            print("finally в первом блоке try");
        }
    }
} /* Output:
Входим в первый блок try
Входим во второй блок try
finally во втором блоке try
Перехвачено FourException в первом блоке try
finally в первом блоке try
*///:~