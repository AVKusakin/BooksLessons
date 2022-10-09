package Chapter11.Exercises;

import java.util.*;

/**
 * 2. Измените пример SimpleCollection.java так, чтобы в качестве контейнера c использовалось множество (Set).
 * @see Chapter11.Examples.SimpleCollection
 * date: 09.10.2022
 */
public class Exercise2 {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Автоматическая упаковка
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}