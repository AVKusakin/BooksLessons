package Chapter11.Examples;

//: holding/ApplesAndOrangeWithGenerics.java
import java.util.*;

public class ApplesAndOrangeWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Ошибка во время компиляции:
        // apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());
        // Использование синтаксиса foreach:
        for (Apple c : apples)
            System.out.println(c.id());
    }
} /* Output:
0
1
2
0
1
2
*///:~