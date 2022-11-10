package Chapter14.Examples;

//: typeinfo/SweetShop.java
// Examination of the way the class loader works.
import static net.mindview.util.Print.*;

class Candy {
    static { print("Загрузка класса Candy"); }
}

class Gum {
    static { print("Загрузка класса Gum"); }
}

class Cookie {
    static { print("Загрузка класса Cookie"); }
}

public class SweetShop {
    public static void main(String[] args) {
        print("в методе main");
        new Candy();
        print("После создания объекта Candy");
        try {
            Class.forName("Chapter14.Examples.Gum");
        } catch (ClassNotFoundException e) {
            print("Не удалось найти Gum");
        }
        print("После вызова метода Class.forName(\"Gum\")");
        new Cookie();
        print("После создания объекта Cookie");
    }
} /* Output:
в методе main
Загрузка класса Candy
После создания объекта Candy
Загрузка класса Gum
После вызова метода Class.forName("Gum")
Загрузка класса Cookie
После создания объекта Cookie
*///:~