package Chapter8.Examples;

//: polymorphism/PrivateOverride.java
// Попытка переопределения приватного метода
import static net.mindview.util.Print.*;

public class PrivateOverride {
    private void f() {
        print("private f()");
    }
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
} /* Output:
private f()
*///:~