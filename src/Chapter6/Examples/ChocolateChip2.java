package Chapter6.Examples;

//: access/ChocolateChip2.java
import Chapter6.Examples.cookie2.*;

public class ChocolateChip2 extends Cookie {
    public ChocolateChip2() {
        System.out.println("ChocolateChip2 constructor");
    }
    public void chomp() {
        bite();
    } // Защищенный метод
    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
} /* Output:
Конструктор Cookie
ChocolateChip2 constructor
bite
*///:~