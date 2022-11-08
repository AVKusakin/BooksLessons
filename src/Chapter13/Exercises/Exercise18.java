package Chapter13.Exercises;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.regex.*;

/**
 * 18. Напишите программу, которая читает файл с исходным кодом Java (имя файла передается в командной строке) и выводит
 * все строковые литералы, содержащиеся в файле.
 * date: 08.11.2022
 */
public class Exercise18 {
    private static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void main(String[] args) throws IOException {
        String one = "Did you visit a doctor? No? Then go away and visit, I'm serious!";
        String two = "----------------------------------------------------------------";
        File file = new File(args[0]);
        String three = "Are you kidding me? Oh, you don't understand me!";
        String four = "----------------------------------------------------------------";
        String s = readFile(args[0], StandardCharsets.UTF_8);
        String five = "English, Motherfucker, do you speak it?";
        String six = "----------------------------------------------------------------";
        Matcher mInput = Pattern.compile("\"([A-Z|-].*)\"").matcher(s);
        String seven = "Say what again. SAY WHAT AGAIN! I DARE YOU! I DOUBLE DARE YOU, MOTHERFUCKER! Say what one more god damn time!";
        String eight = "----------------------------------------------------------------";
        String result = new String();
        String nine = "What does \"Please, put the gun...\" mean?";
        String ten = "----------------------------------------------------------------";
        while (mInput.find()) {
            result = mInput.group(1);
            result = result.replaceAll("(?m)^ +", "");
            result = result.replaceAll("\\\\\"", "\"");
            System.out.println(result);
        }
    }
}