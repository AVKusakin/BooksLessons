package Chapter11.Exercises;

import java.util.*;
import net.mindview.util.*;

/**
 * 20. Измените упражнение 16 так, чтобы в контейнере хранилось количество вхождений каждой гласной.
 * @see Chapter11.Exercises.Exercise16
 * date: 11.10.2022
 */
public class Exercise20 {
    public static int getSum(List<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static int count(String str1, String str2) {
        return (str1.length() - str1.replace(str2, "").length()) / str2.length();
    }

    public static void main(String[] args) {
        Set<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "a A e E i I o O u U y Y".split(" "));
        String words = TextFile.read("src/Chapter11/Examples/SetOperations.java");

        Map<String, Integer> vowelsFrequency = new LinkedHashMap<String, Integer>();
        for (String vowel : vowels)
            vowelsFrequency.put(vowel, count(words, vowel));

        List<Integer> vowelsCount = new ArrayList<>();
        for (String key : vowelsFrequency.keySet())
            vowelsCount.add(vowelsFrequency.get(key));

        System.out.println("words: " + words);
        System.out.println("vowels frequency in words: " + vowelsFrequency);
        System.out.println("total vowels count: " + getSum(vowelsCount));
    }
}