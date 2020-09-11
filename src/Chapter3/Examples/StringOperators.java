package Chapter3.Examples;

//: operators/StringOperators.java
import static net.mindview.util.Print.*;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        print(s + x + y + z);
        print(x + " " + s); // Преобразует x в String
        s += "(summed) = "; // Оператор конкатенации
        print(s + (x + y + z));
        print("" + x); // Сокращение для Integer.toString()
    }
} /* Output:
x, y, z 012
0 x, y, z
x, y, z (summed) = 3
0
*///:~