package Chapter10.Exercises;
/**
 * 2. Создайте класс, который содержит String и метод toString() для вывода хранимой строки. Добавьте несколько экземпляров
 * нового класса в объект Sequence и выведите их.
 * @see Chapter10.Examples.Sequence
 * date: 10.11.2020
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

class ForExercise2 {
    String string = "new String";

    @Override
    public String toString() {
        return string;
    }
}

class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
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
        return new SequenceSelector();
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        for (int i = 0; i < 5; i++)
            sequence.add(new ForExercise2());
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}