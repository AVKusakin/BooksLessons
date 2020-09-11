package Chapter3.Examples;

//: operators/Bool.java
// Операторы сравнений и логические операторы.
import java.util.*;
import static net.mindview.util.Print.*;

public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = " + i);
        print("j = " + j);
        print("i > j is " + (i > j));
        print("i < j is " + (i < j));
        print("i >= j is " + (i >= j));
        print("i <= j is " + (i <= j));
        print("i == j is " + (i == j));
        print("i != j is " + (i != j));
        // В Java целое число не может
        // интерпретироваться как логический тип (boolean)
        //! print("i && j is " + (i && j));
        //! print("i || j is " + (i || j));
        //! print("!i is " + !i);
        print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        print("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }
}
