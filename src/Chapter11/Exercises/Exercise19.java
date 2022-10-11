package Chapter11.Exercises;

import java.util.*;

/**
 * 19. Повторите предыдущее упражнение с HashSet и LinkedHashSet.
 * @see Chapter11.Exercises.Exercise18
 * date: 11.10.2022
 */
public class Exercise19 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("firstValue");
        hashSet.add("secondValue");
        hashSet.add("thirdValue");
        hashSet.add("fourthValue");
        hashSet.add("fifthValue");

        Set<String> treeSet = new TreeSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();

        for (String value : hashSet) {
            System.out.println(value + " hashCode: " + value.hashCode());
            treeSet.add(value);
        }
        System.out.println("hashSet: " + hashSet);
        System.out.println("treeSet: " + treeSet);

        for (String value : hashSet) {
            linkedHashSet.add(value);
        }

        System.out.println("linkedHashSet 1: " + linkedHashSet);
        linkedHashSet.clear();

        for (String value : treeSet) {
            linkedHashSet.add(value);
        }

        System.out.println("linkedHashSet 2: " + linkedHashSet);
    }
}