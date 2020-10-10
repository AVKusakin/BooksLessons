package Chapter7.Examples;

//: reusing/Beetle.java
// Полный процесс инициализации.
import static net.mindview.util.Print.*;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("Поле static Insect.x1 инициализировано");
    static int printInit(String s) {
        print(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Поле Beetle.k инициализировано");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 = printInit("Поле static Beetle.x2 инициализировано");
    public static void main(String[] args) {
        print("Конструктор Beetle");
        Beetle b = new Beetle();
    }
} /* Output:
Поле static Insect.x1 инициализировано
Поле static Beetle.x2 инициализировано
Конструктор Beetle
i = 9, j = 0
Поле Beetle.k инициализировано
k = 47
j = 39
*///:~