package Chapter13.Exercises;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.regex.*;

/**
 * 17. Напишите программу, которая читает файл с исходным кодом Java (имя файла передается в командной строке) и выводит
 * все комментарии, содержащиеся в файле.
 * date: 08.11.2022
 */
public class Exercise17 {
    private static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void main(String[] args) throws IOException {
        // Comment moment
        // ----------------------------------------------------------------
        File file = new File(args[0]);
        // Another comment
        // ----------------------------------------------------------------
        String s = readFile(args[0], StandardCharsets.UTF_8);
        // Why are you still reading this? Are you OK?
        // ----------------------------------------------------------------
        Matcher mInput = Pattern.compile(" +//(.+)").matcher(s);
        // Man, just stop, please!
        // ----------------------------------------------------------------
        String result = new String();
        // Fine! You are a psycho! I'm afraid of you! Contact a doctor!!!
        // ----------------------------------------------------------------
        while (mInput.find()) {
            result = mInput.group(1);
            result = result.replaceAll("(?m)^ +", "");
            System.out.println(result);
        }
    }
}