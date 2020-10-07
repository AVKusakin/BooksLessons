package Chapter7.Examples;

//: reusing/Cartoon.java
// Вызовы конструктора при проведении наследования.
import static net.mindview.util.Print.*;

class Art {
    Art() {
        print("Конструктор Art");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Конструктор Drawing");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        print("Конструктор Cartoon");
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
} /* Output:
Конструктор Art
Конструктор Drawing
Конструктор Cartoon
*///:~