package Chapter5.Examples;

//: initialization/Mugs.java
// "Инициализация экземпляра" в Java.
import static net.mindview.util.Print.*;

class Mug {
    Mug(int marker) {
        print("Mug(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        print("mug1 & mug2 инициализированы");
    }
    Mugs() {
        print("Mugs()");
    }
    Mugs(int i) {
        print("Mugs(int)");
    }
    public static void main(String[] args) {
        print("В методе main()");
        new Mugs();
        print("new Mugs() завершено");
        new Mugs(1);
        print("new Mugs(1) завершено");
    }
} /* Output:
В методе main()
Mug(1)
Mug(2)
mug1 & mug2 инициализированы
Mugs()
new Mugs() завершено
Mug(1)
Mug(2)
mug1 & mug2 инициализированы
Mugs(int)
new Mugs(1) завершено
*///:~