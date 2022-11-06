package Chapter13.Exercises;

import java.util.*;
import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * 12. Измените пример Groups.java так, чтобы в нем подсчитывались все уникальные слова, не начинающиеся с прописной буквы.
 * @see Chapter13.Examples.Groups
 * date: 06.11.2022
 */
public class Exercise12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static HashMap<String, Integer> uniqueWordsCount = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\s[a-z]+").matcher(POEM);
        while (m.find()) {
            String word = m.group();
            if (uniqueWordsCount.containsKey(word)) {
                uniqueWordsCount.replace(word, uniqueWordsCount.get(word) + 1);
            } else {
                uniqueWordsCount.put(m.group(), 1);
            }
        }
        print(uniqueWordsCount);
    }
}