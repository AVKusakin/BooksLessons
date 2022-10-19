package Chapter12.Exercises;

/**
 * 12. Измените пример innerclasses/Sequence.java так, чтобы при попытке размещения слишком большого количества элементов
 * программа выдавала соответствующее исключение.
 * @see Chapter10.Examples.Sequence
 * date: 19.10.2022
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Exercise12 {
    private Object[] items;
    private int next = 0;
    public Exercise12(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
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
    }
    public Selector selector() {
        return new Exercise12.SequenceSelector();
    }

    public static void main(String[] args) {
        Exercise12 sequence = new Exercise12(10);
        for (int i = 0; i < 12; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        try {
            sequence.items[11] = 11;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}