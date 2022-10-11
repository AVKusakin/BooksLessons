package Chapter11.Exercises;

import java.util.*;

/**
 * 18. Заполните контейнер HashMap парами «ключ-значение». Выведите результаты, чтобы продемонстрировать упорядочение по
 * хеш-коду. Извлеките пары, отсортируйте по ключу и поместите результат в LinkedHashMap. Покажите, что элементы хранятся
 * в порядке вставки.
 * date: 11.10.2022
 */
public class Exercise18 {
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("firstKey","firstValue");
        hashMap.put("secondKey","secondValue");
        hashMap.put("thirdKey","thirdValue");
        hashMap.put("fourthKey","fourthValue");
        hashMap.put("fifthKey","fifthValue");

        Map<String,String> treeMap = new TreeMap<String, String>();
        Map<String,String> linkedHashMap = new LinkedHashMap<String, String>();

        for (String key : hashMap.keySet()) {
            System.out.println(hashMap.get(key) + " hashCode: " + hashMap.get(key).hashCode());
            treeMap.put(key, hashMap.get(key));
        }
        System.out.println("hashMap: " + hashMap);
        System.out.println("treeMap: " + treeMap);

        for (String key : hashMap.keySet()) {
            linkedHashMap.put(key, hashMap.get(key));
        }

        System.out.println("linkedHashMap 1: " + linkedHashMap);
        linkedHashMap.clear();

        for (String key : treeMap.keySet()) {
            linkedHashMap.put(key, treeMap.get(key));
        }

        System.out.println("linkedHashMap 2: " + linkedHashMap);
    }
}