package Chapter8.Examples;

//: polymorphism/ReferenceCounting.java
// Уничтожение совместно используемых встроенных объектов
import static net.mindview.util.Print.*;

class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        print("Создаем " + this);
    }
    public void addRef() {
        refCount++;
    }
    protected void dispose() {
        if (--refCount == 0)
            print("Disposing " + this);
    }
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        print("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        print("Disposing " + this);
        shared.dispose();
    }
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared),
                                  new Composing(shared), new Composing(shared)};
        for (Composing c : composing)
            c.dispose();
    }
} /* Output:
Создаем Shared 0
Создаем Composing 0
Создаем Composing 1
Создаем Composing 2
Создаем Composing 3
Создаем Composing 4
Disposing Composing 0
Disposing Composing 1
Disposing Composing 2
Disposing Composing 3
Disposing Composing 4
Disposing Shared 0
*///:~