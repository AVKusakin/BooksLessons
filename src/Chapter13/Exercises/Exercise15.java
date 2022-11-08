package Chapter13.Exercises;

import java.util.regex.*;
import net.mindview.util.*;

/**
 * 15. Перепишите класс JGrep.java так, чтобы в его аргументах могли передаваться флаги (например, Pattern.CASE_INSENSITIVE,
 * Pattern.MULTILINE).
 * @see Chapter13.Examples.JGrep
 * date: 08.11.2022
 */
public class Exercise15 {
    public static void main(String[] args) throws Exception {
        args = new String[]{"src/Chapter13/Exercises/Exercise15.java", "\\b[Ssct]\\w+", "2", "8"};

        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1], Integer.parseInt(args[2]) | Integer.parseInt(args[3]));
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }
}