package Chapter11.Examples;

//: holding/ModifyingArraysAsList.java
import java.util.*;

public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
        System.out.println("До перемешивания: " + list1);
        Collections.shuffle(list1, rand);
        System.out.println("После перемешивания: " + list1);
        System.out.println("массив: " + Arrays.toString(ia));
        
        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("До перемешивания: " + list2);
        Collections.shuffle(list2, rand);
        System.out.println("После перемешивания: " + list2);
        System.out.println("массив: " + Arrays.toString(ia));
    }
} /* Output:
До перемешивания: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
После перемешивания: [4, 6, 3, 1, 8, 7, 2, 5, 10, 9]
массив: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
До перемешивания: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
После перемешивания: [9, 1, 6, 3, 7, 2, 5, 10, 4, 8]
массив: [9, 1, 6, 3, 7, 2, 5, 10, 4, 8]
*///:~