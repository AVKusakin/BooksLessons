package Chapter11.Exercises;

import java.util.*;

/**
 * 12. Создайте и заполните контейнер List<Integer>. Создайте второй контейнер List<Integer> того же размера. Используйте
 * итераторы ListIterator для чтения элементов из первого контейнера List и вставки их во второй контейнер в обратном
 * порядке. (Проанализируйте несколько разных способов решения этой задачи.)
 * date: 09.10.2022
 */
public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(75, 435, 92, 50, 47, 1197, 853, 9));
        List<Integer> list2 = new ArrayList<>();

        // 1
        System.out.println("1: ");
        ListIterator<Integer> it = list1.listIterator();
        System.out.print("list1: ");
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
        while (it.hasPrevious())
            list2.add(it.previous());
        System.out.print("list2: ");
        for (Integer num : list2)
            System.out.print(num + " ");
        System.out.println();

        // 2
        System.out.println("2: ");
        list2.clear();

        ListIterator<Integer> lit = list1.listIterator(list1.size());
        System.out.print("list1: ");
        while (lit.hasPrevious()) {
            Integer number = lit.previous();
            System.out.print(number + " ");
            list2.add(number);
        }

        System.out.println();
        System.out.print("list2: ");
        for (Integer num : list2)
            System.out.print(num + " ");
    }
}