package Chapter11.Exercises;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * 25. Создайте контейнер Map<String,ArrayList<Integer>>. Используя net.mindview.TextFile, откройте текстовый файл и
 * прочитайте его по словам (передайте "\\W+" во втором аргументе конструктора TextFile). Подсчитывайте слова в процессе
 * чтения; для каждого слова в файле сохраните в ArrayList<Integer> счётчик слов, связанный с этим словом (то есть
 * фактически позицию файла, в которой было обнаружено данное слово).
 * @see net.mindview.util.TextFile
 * date: 11.10.2022
 */
public class Exercise25 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        List<String> words = new ArrayList<String>(new TextFile("src/Chapter11/Examples/SetOperations.java", "\\W+"));

        for (int i = 0; i < words.size(); i++) {
            ArrayList<Integer> position = new ArrayList<Integer>(Collections.nCopies(words.size(), 0));
            position.set(i, 1);
            map.put(words.get(i), position);
        }

        for (String word : map.keySet())
            System.out.println(word + "=" + map.get(word));
    }
}