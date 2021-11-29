package Chapter10.Exercises;

/**
 * 22. Реализуйте reverseSelector() в Sequence.java.
 * @see Chapter10.Examples.Sequence
 * date: 29.11.2021
 */
public class Exercise22 {
    private Object[] items;
    private int next = 0;
    public Exercise22(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class DirectSequenceSelector implements Selector {
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

    private class ReverseSequenceSelector implements Selector {
        private int i = items.length - 1;
        public boolean end() {
            return i == 0;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i > 0) i--;
        }
    }

    public Selector directSelector() {
        return new DirectSequenceSelector();
    }
    public Selector reverseSelector() {
        return new ReverseSequenceSelector();
    }

    public static void main(String[] args) {
        Exercise22 sequence = new Exercise22(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }
    }
}