package Chapter13.Exercises;

import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * 10. Определите, будет ли найдено в строке «Java now has regular expressions» совпадение для следующих выражений:
 * ^Java
 * \Breg.*
 * n.w\s+h(a|i)s
 * s?
 * s*
 * s+
 * s{4}
 * s{1}
 * s{0,3}
 * date: 04.11.2022
 */
public class Exercise10 {
    public static void main(String[] args) {
        args = new String[]{"Java now has regular expressions", "^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+",
                "s{4}", "s{1}", "s{0,3}"};
        print("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            print("Regular Expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
            }
        }
    }
}