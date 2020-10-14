package Chapter8.Exercises;

import static net.mindview.util.Print.*;

/**
 * 13. Включите метод finalize() в ReferenceCounting.java, чтобы проверить условие завершения.
 * @see Chapter8.Examples.ReferenceCounting
 * date: 14.10.2020
 */
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
    protected void dispose() throws Throwable {
        if (--refCount == 0) {
            print("Disposing " + this);
            this.finalize();
        }

    }
    public void finalize() throws Throwable {
        System.out.println(this + " is finalized!");
        super.finalize();
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
    protected void dispose() throws Throwable {
        print("Disposing " + this);
        this.finalize();
        shared.dispose();
    }
    public void finalize() throws Throwable {
        System.out.println(this + " is finalized!");
        super.finalize();
    }
    public String toString() {
        return "Composing " + id;
    }
}

public class Exercise13 {
    public static void main(String[] args) throws Throwable {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        for (Composing c : composing)
            c.dispose();
    }
}