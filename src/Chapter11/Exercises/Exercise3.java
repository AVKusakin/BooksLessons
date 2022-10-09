package Chapter11.Exercises;

import java.util.*;

/**
 * 3. Измените пример innerclasses/Sequence.java так, чтобы в контейнер можно было добавить произвольное количество элементов.
 * @see Chapter10.Examples.Sequence
 * date: 09.10.2022
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Exercise3 {
    private List<Object> items;
    public Exercise3() {
        items = new ArrayList<>();
    }
    public void add(Object x) {
        items.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return i == items.size();
        }
        public Object current() {
            return items.get(i);
        }
        public void next() {
            if (i < items.size()) i++;
        }
    }
    public Selector selector() {
        return new Exercise3.SequenceSelector();
    }
    public static void main(String[] args) {
        Exercise3 sequence = new Exercise3();
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        for (int i = 0; i < 10; i++) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}