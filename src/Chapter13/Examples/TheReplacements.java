package Chapter13.Examples;

//: strings/TheReplacements.java
import java.util.regex.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

/*! Here's a block of text to use as input to the regular expression matcher. Note that we'll first extract the block of
   text by looking for the special delimiters, then process the extracted block. !*/

public class TheReplacements {
    public static void main(String[] args) {
        String s = TextFile.read("src/Chapter13/Examples/TheReplacements.java");
        // Поиск блока текста, заключенного в специальные комментарии:
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (mInput.find())
            s = mInput.group(1); // Совпадение подвыражения в круглых скобках
        // Два и более пробела заменяются одним пробелом:
        s = s.replaceAll(" {2,}", " ");
        // Один и более пробелов в начале строки заменяются пустой строкой.
        // Для выполнения должен быть активен режим MULTILINE:
        s = s.replaceAll("(?m)^ +", "");
        print(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        // Обработка информации find при выполнении замены:
        while (m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
        // Присоединение оставшегося текста:
        m.appendTail(sbuf);
        print(sbuf);
    }
} /* Output:
Here's a block of text to use as input to the regular expression matcher. Note that we'll first extract the block of
text by looking for the special delimiters, then process the extracted block.
H(VOWEL1)rE's A blOck Of tExt tO UsE As InpUt tO thE rEgUlAr ExprEssIOn mAtchEr. NOtE thAt wE'll fIrst ExtrAct thE blOck Of
tExt by lOOkIng fOr thE spEcIAl dElImItErs, thEn prOcEss thE ExtrActEd blOck.
*///:~