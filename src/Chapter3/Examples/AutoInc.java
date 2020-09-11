package Chapter3.Examples;

//: operators/AutoInc.java
import static net.mindview.util.Print.*;

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i : " + i);
        print("++i : " + ++i); // Префиксный инкремент
        print("i++ : " + i++); // Постфиксный инкремент
        print("i : " + i);
        print("--i : " + --i); // Префиксный декремент
        print("i-- : " + i--); // Постфиксный декремент
        print("i : " + i);
    }
} /* Output:
i : 1
++i : 2
i++ : 2
i : 3
--i : 2
i-- : 2
i : 1
*///:~