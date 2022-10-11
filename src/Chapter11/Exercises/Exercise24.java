package Chapter11.Exercises;

import java.util.*;

/**
 * 24. Заполните карту LinkedHashMap строковыми ключами и такими же значениями, взятыми по вашему усмотрению. После этого
 * извлеките пары, отсортируйте их по ключам и заново вставьте в карту.
 * date: 11.10.2022
 */
public class Exercise24 {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("firstKey","firstValue");
        linkedHashMap.put("secondKey","secondValue");
        linkedHashMap.put("thirdKey","thirdValue");
        linkedHashMap.put("fourthKey","fourthValue");
        linkedHashMap.put("fifthKey","fifthValue");
        System.out.println(linkedHashMap);

        Map<String,String> treeMap = new TreeMap<>();
        Set<String> keys = new TreeSet<>(linkedHashMap.keySet());
        for (String key : keys) {
            treeMap.put(key, linkedHashMap.get(key));
        }

        linkedHashMap.clear();
        linkedHashMap = treeMap;
        System.out.println(linkedHashMap);
    }
}