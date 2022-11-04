package Chapter13.Exercises;

import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * 11. Определите, будет ли найдено в строке «Java now has regular expressions» совпадение для следующих выражений:
 * (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
 *
 * "Arline ate eight apples and one orange while Anita hadn't any"
 * date: 04.11.2022
 */
public class Exercise11 {
    public static void main(String[] args) {
        String inputString = "Arline ate eight apples and one orange while Anita hadn't any";
        String regularExpression = "(?i)((^[aeiou])|(\s+[aeiou]))\\w+?[aeiou]\b";
        print("Input: \"" + inputString + "\"");
        print("Regular Expression: \"" + regularExpression + "\"");
        Pattern p = Pattern.compile(regularExpression);
        Matcher m = p.matcher(inputString);
        while (m.find()) {
            print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
        }
    }
}