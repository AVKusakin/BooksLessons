package Chapter10.Exercises;

/**
 * 4. Добавьте в класс Sequence.SequenceSelector метод для получения ссылки на внешний класс Sequence.
 * @see Chapter10.Examples.Sequence
 * date: 07.03.2021
 */
interface Selector2 {
    boolean end();
    Object current();
    void next();
    Sequence2 outer();
}

class Sequence2 {
    private Object[] items;
    private int next = 0;
    public Sequence2(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector2 implements Selector2 {
        private int i = 0;
        public boolean end() {
            return i == items.length;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i < items.length) i++;
        }
        public Sequence2 outer() {
            return Sequence2.this;
        }
    }
    public Selector2 selector() {
        return new SequenceSelector2();
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Sequence2 sequence = new Sequence2(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector2 selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            System.out.println(selector.outer().toString());
            selector.next();
        }
    }
}