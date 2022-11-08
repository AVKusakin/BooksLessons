package Chapter13.Examples;

//: strings/JGrep.java
// Very simple version of the program "grep".
// {Args: JGrep.java "\\b[Ssct]\\w+"}
import java.util.regex.*;
import net.mindview.util.*;

public class JGrep {
    public static void main(String[] args) throws Exception {
        args = new String[]{"src/Chapter13/Examples/JGrep.java", "\\b[Ssct]\\w+"};

        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        // Перебор строк входного файла:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }
} /* Output: (Sample)
0: strings: 4
1: simple: 8
2: the: 26
3: Ssct: 26
4: class: 7
5: static: 11
6: String: 28
7: throws: 43
8: String: 19
9: src: 29
10: Ssct: 70
11: System: 12
12: System: 12
13: compile: 28
14: String: 13
15: System: 16
16: start: 73
*///:~