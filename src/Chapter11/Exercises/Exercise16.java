package Chapter11.Exercises;

import java.util.*;
import net.mindview.util.*;

/**
 * 16. Создайте контейнер Set со всеми гласными буквами. Взяв за основу пример UniqueWords.java, подсчитайте и выведите
 * количество гласных в каждом входном слове, а также выведите общее количество гласных во входном файле.
 * @see Chapter11.Examples.UniqueWords
 * date: 10.10.2022
 */
public class Exercise16 {
    public static int getSum(List<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Set<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "a A e E i I o O u U y Y".split(" "));
        Set<String> words = new TreeSet<String>(new TextFile("src/Chapter11/Examples/SetOperations.java", "\\W+"));
        List<Integer> vowelsCount = new ArrayList<>();
        for (String word : words) {
            int count = 0;
            for (String vowel : vowels) {
                if (word.contains(vowel))
                    count++;
            }
            vowelsCount.add(count);
        }
        System.out.println("words: " + words);
        System.out.println("vowels count in words: " + vowelsCount);
        System.out.println("total vowels count: " + getSum(vowelsCount));
    }
}