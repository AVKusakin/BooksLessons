package Chapter6.Examples;

//: access/ChocolateChip.java
// Члены с пакетным доступом недоступны из другого пакета.
import Chapter6.Examples.dessert.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("Конструктор ChocolateChip");
    }
    public void chomp() {
        //! bite(); // Метод bite недоступен
    }
    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
} /* Output:
Конструктор Cookie
Конструктор ChocolateChip
*///:~