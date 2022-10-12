package Chapter11.Exercises;

import java.util.*;

/**
 * 28. Заполните конейнер PriorityQueue (с использованием метода offer()) значениями Double, созданными генератором
 * java.util.Random. Извлеките элементы из очереди методом poll() и выведите их.
 * date: 12.10.2022
 */
public class Exercise28 {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            priorityQueue.offer(rand.nextDouble(i + 10));

        int size = priorityQueue.size();
        for (int i = 0; i < size; i++)
            System.out.println(priorityQueue.poll());
    }
}