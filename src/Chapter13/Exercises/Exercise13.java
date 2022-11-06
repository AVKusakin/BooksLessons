package Chapter13.Exercises;

import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * 13. Измените пример StartEnd.java, чтобы он использовал входные данные Groups.POEM, но при этом выдавал положительные
 * результаты для find(), lookingAt() и matches().
 * @see Chapter13.Examples.Groups
 * @see Chapter13.Examples.StartEnd
 * date: 06.11.2022
 */
public class Exercise13 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.";
    private static class Display {
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex) {
            this.regex = regex;
        }
        void display(String message) {
            if (!regexPrinted) {
                print(regex);
                regexPrinted = true;
            }
            print(message);
        }
    }
    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            d.display("find() '" + m.group() + "' start = " + m.start() + " end = " + m.end());
        if (m.lookingAt())
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());
        if (m.matches())
            d.display("matches() start = " + m.start() + " end = " + m.end());
    }
    public static void main(String[] args) {
        for (String in : POEM.split("\n")) {
            print("input : " + in);
            for (String regex : new String[]{"\\w*illig\\w*", "\\w*were", "T\\w+", "Beware.*"})
                examine(in, regex);
        }
    }
}