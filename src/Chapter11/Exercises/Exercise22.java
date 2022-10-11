package Chapter11.Exercises;

import java.util.*;
import net.mindview.util.*;

/**
 * 22. Измените предыдущее упражнение так, чтобы для хранения слов в нем использовался класс с объектом String и полем
 * счетчика. Для хранения списка слов должен использоваться контейнер Set, содержащий такие объекты.
 * @see Chapter11.Exercises.Exercise21
 * date: 11.10.2022
 */
class WordFreq implements Comparable<WordFreq> {
    private String word;

    private int frequency;

    public WordFreq(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public int compareTo(WordFreq o) {
        return this.word.equals(o.getWord()) ? 0 : 1;
    }

    @Override
    public String toString() {
        return this.word + "=" + this.frequency;
    }

    @Override
    public boolean equals(Object obj) {
        return ((WordFreq) obj).getWord().equals(this.word);
    }

    @Override
    public int hashCode() {
        return this.word.hashCode();
    }
}

public class Exercise22 {
    public static void main(String[] args) {
        Set<WordFreq> wordsFrequency = new HashSet<WordFreq>();
        List<String> words = new ArrayList<>(new TextFile("src/Chapter11/Examples/SetOperations.java", "\\W+"));
        int freq;

        for (String word : words) {
            WordFreq wordFrequency = new WordFreq(word);
            wordFrequency.setFrequency(1);

            if (wordsFrequency.size() > 0) {
                if (wordsFrequency.contains(wordFrequency)) {
                    for (WordFreq wordFreq : wordsFrequency) {
                        freq = wordFreq.equals(wordFrequency) ? wordFreq.getFrequency() + 1 : wordFreq.getFrequency();
                        if (wordFreq.equals(wordFrequency)) {
                            wordFrequency.setFrequency(freq);
                            wordsFrequency.remove(wordFreq);
                            wordsFrequency.add(wordFrequency);
                            break;
                        }
                    }
                }
            }
            wordsFrequency.add(wordFrequency);
        }

        Set<String> wordFreqs = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        for (WordFreq wordFreq : wordsFrequency)
            wordFreqs.add(wordFreq.toString());

        System.out.println(wordFreqs);
    }
}