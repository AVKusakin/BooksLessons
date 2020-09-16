package Chapter5.Examples;

//: initialization/OverloadingOrder.java
// Перегрузка, основанная на порядке
// следования аргументов
import static net.mindview.util.Print.*;

public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }
    static void f(int i, String s) {
        print("int: " + i + ", String: " + s);
    }
    public static void main(String[] args) {
        f("Сначала строка", 11);
        f(99, "Сначала число");
    }
} /* Output:
String: Сначала строка, int: 11
int: 99, String: Сначала число
*///:~