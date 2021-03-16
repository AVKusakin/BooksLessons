package Chapter10.Examples;

//: innerclasses/AnonymousConstructor.java
// Создание конструктора для анонимного внутреннего класса.
import static net.mindview.util.Print.*;

abstract class Base {
    public Base(int i) {
        print("Базовый конструктор, i = " + i);
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {print("В инициализаторе экземпляра");}
            public void f() {
                print("В анонимном f()");
            }
        };
    }
    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
} /* Output:
Базовый конструктор, i = 47
В инициализаторе экземпляра
В анонимном f()
*///:~