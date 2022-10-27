package Chapter13.Exercises;

import java.util.*;

/**
 * 2. Исправьте ошибку в InfiniteRecursion.java.
 * @see Chapter13.Examples.InfiniteRecursion
 * date: 27.10.2022
 */
public class Exercise2 {
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }
    public static void main(String[] args) {
        List<Exercise2> v = new ArrayList<Exercise2>();
        for (int i = 0; i < 10; i++) {
            v.add(new Exercise2());
        }
        System.out.println(v);
    }
}