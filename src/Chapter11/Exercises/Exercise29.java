package Chapter11.Exercises;

import java.util.*;

/**
 * 29. Создайте простой класс, производный от Object и не содержащий членов. Покажите, что множественные элементы этого
 * класса не могут быть добавлены в PriorityQueue. Проблема будет более подробно рассмотрена в главе 17.
 * date: 12.10.2022
 */
class Class {}

public class Exercise29 {
    public static void main(String[] args) {
        PriorityQueue<Class> priorityQueue = new PriorityQueue<Class>();

        for (int i = 0; i < 10; i++)
            priorityQueue.offer(new Class()); // Exception
    }
}