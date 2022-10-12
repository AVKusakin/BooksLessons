package Chapter11.Exercises;

import java.util.*;
import net.mindview.util.*;

/**
 * 26. Возьмите контейнер Map из предыдущего упражнения и воссоздайте порядок слов в исходном файле.
 * @see Chapter11.Exercises.Exercise25
 * date: 12.10.2022
 */
public class Exercise26 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        List<String> words = new ArrayList<String>(new TextFile("src/Chapter11/Examples/SetOperations.java", "\\W+"));

        for (int i = 0; i < words.size(); i++) {
            ArrayList<Integer> position = new ArrayList<Integer>(Collections.nCopies(words.size(), 0));
            for (int j = 0; j < words.size(); j++) {
                if (words.get(j).equals(words.get(i)))
                    position.set(j, 1);
            }

            map.put(words.get(i), position);
        }

        String[] file = new String[words.size()];
        List<Integer> positions = new ArrayList<>();

        for (String key : map.keySet()) {
            ArrayList<Integer> wordPosition = map.get(key);

            for (int i = 0; i < wordPosition.size(); i++) {
                if (wordPosition.get(i) == 1)
                    positions.add(i);
            }

            for (int i = 0; i < positions.size(); i++)
                file[positions.get(i)] = key;

            positions.clear();
        }

        System.out.println("original word order: " + words);
        System.out.print("restored word order: [");
        for (int i = 0; i < file.length - 1; i++)
            System.out.print(file[i] + ", ");
        System.out.print(file[file.length - 1] + "]");
    }
}