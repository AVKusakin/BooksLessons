package Chapter11.Exercises;

import java.util.*;

/**
 * 14. Создайте пустой контейнер LinkedList<Integer>. Используя итератор ListIterator, добавьте в List значения Integer;
 * все операции вставки должны осуществляться в середине списка.
 * date: 09.10.2022
 */
public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        ListIterator<Integer> it = list.listIterator();

        for (int i = 0; i < 10; i++) {
            if (!it.hasNext()) {
                it.add(i);
                it.add(i+1);
                it = list.listIterator(i+1);
            } else {
                it.set(i);
            }
            it.next();
        }

        for (Integer number : list)
            System.out.print(number + " ");
    }
}