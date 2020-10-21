package Chapter9.Exercises;

import java.io.*;
import java.nio.*;
import java.util.*;

/**
 * 16. Создайте класс, который генерирует серию char. Адаптируйте его так, чтобы он мог использоваться для передачи
 * данных Scanner.
 * @see Chapter9.Examples.RandomWords
 * @see Chapter9.Examples.AdaptedRandomDoubles
 * date: 21.10.2020
 */
public class Exercise16 implements Readable {
    private int count;
    public Exercise16(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;
        char[] result = generateCharSequence();
        for (int i = 0; i < result.length; i++) {
            cb.append(result[i]);
        }
        return result.length;
    }

    public char[] generateCharSequence() {
        char[] buf = new char[9];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (char) (65 + Math.random() * 60);
        }
        return buf;
    }

    public static void main(String[] args) {
        Exercise16 e = new Exercise16(2);
        Scanner s = new Scanner(e);
        System.out.println(e.generateCharSequence());
        System.out.println();
        while (s.hasNext())
            System.out.print(s.next() + " ");
    }
}