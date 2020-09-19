package Chapter5.Examples;

//: initialization/OrderOfInitialization.java
// Демонстрирует порядок инициализации
import static net.mindview.util.Print.*;

// При вызове конструктора для создания объекта
// Window выводится сообщение:
class Window {
    Window(int marker) { print("Window(" + marker + ")"); }
}

class House {
    Window w1 = new Window(1); // Перед конструктором
    House() {
        // Показывает, что выполняется конструктор:
        print("House()");
        w3 = new Window(33); // Повторная инициализация w3
    }
    Window w2 = new Window(2); // После конструктора
    void f() { print("f()"); }
    Window w3 = new Window(3); // В конце
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Показывает, что объект сконструирован
    }
} /* Output:
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
*///:~