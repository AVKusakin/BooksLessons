package Chapter11.Examples;

//: holding/AdapterMethodIdiom.java
// Идиома "Метод-Адаптер" позволяет использовать foreach с другими разновидностями Iterable.
import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {super(c);}
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    public boolean hasNext() {
                        return current > -1;
                    }
                    public T next() {
                        return get(current--);
                    }
                    public void remove() { // Не реализован
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
        // Получение обычного итератора при помощи iterator():
        for (String s : ral)
            System.out.print(s + " ");
        System.out.println();
        // Передача реализации Iterable по вашему выбору
        for (String s : ral.reversed())
            System.out.print(s + " ");
    }
} /* Output:
To be or not to be
be to not or be To
*///:~