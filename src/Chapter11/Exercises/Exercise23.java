package Chapter11.Exercises;

import java.util.*;

/**
 * 23. Взяв за отправную точку программу Statistics.java, создайте программу, которая циклически повторяет этот тест,
 * проверяя, не появляется ли какое-либо из полученных случайных чисел чаще других.
 * @see Chapter11.Examples.Statistics
 * date: 11.10.2022
 */
public class Exercise23 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        List list = new ArrayList(m.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        System.out.println(list);
    }
}