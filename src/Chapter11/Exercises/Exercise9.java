package Chapter11.Exercises;

import java.util.*;

/**
 * 9. Измените пример innerclasses/Sequence.java так, чтобы контейнер Sequence работал с Iterator вместо Selector.
 * @see Chapter10.Examples.Sequence
 * date: 09.10.2022
 */
public class Exercise9 {
    private List<Object> items;
    public Exercise9() {
        items = new ArrayList<>();
    }
    public void add(Object x) {
        items.add(x);
    }

    public static void main(String[] args) {
        Exercise9 sequence = new Exercise9();
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator<Object> it = sequence.items.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}