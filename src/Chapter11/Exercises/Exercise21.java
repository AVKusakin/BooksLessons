package Chapter11.Exercises;

import java.util.*;
import net.mindview.util.*;

/**
 * 21. Используя конейнер Map<String,Integer>, создайте по образцу UniqueWords.java программу для подсчета вхождений слов
 * в файле. Отсортируйте результаты методом Colections.sort() со вторым аргументом String.CASE_INTENSIVE_ORDER (для
 * получения алфавитной сортировки) и выведите результат.
 * @see Chapter11.Examples.UniqueWords
 * date: 11.10.2022
 */
public class Exercise21 {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        List<String> words = new ArrayList<String>(new TextFile("src/Chapter11/Examples/SetOperations.java", "\\W+"));
        for (String word : words) {
            Integer freq = treeMap.get(word);
            treeMap.put(word, freq == null ? 1 : freq + 1);
        }

        System.out.println(treeMap);
    }
}