package Chapter13.Exercises;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * 19. На основе двух последних упражнений напишите программу, которая анализирует исходный код Java и выдает список всех
 * имен классов, использованных в программе.
 * @see Chapter13.Exercises.Exercise17
 * @see Chapter13.Exercises.Exercise18
 * date: 08.11.2022
 */
public class Exercise19 {
    class FirstClass {}
    private static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        String s = readFile(args[0], StandardCharsets.UTF_8);
        Matcher mInput = Pattern.compile("(class|static|new|throws|=|,) ([A-Z]\\w+)").matcher(s);
        String result = new String();
        Set<String> strings = new LinkedHashSet<>();
        while (mInput.find()) {
            result = mInput.group(2);
            strings.add(result);
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}