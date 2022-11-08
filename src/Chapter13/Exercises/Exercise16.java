package Chapter13.Exercises;

import java.io.*;
import java.util.regex.*;
import net.mindview.util.*;

/**
 * 16. Измените пример JGrep.java, чтобы в аргументе ему можно было передать имя каталога или файла (при передаче каталога
 * в поиск должны включаться все файлы, находящиеся в указанном каталоге). Подсказка: список имен файлов можно построить
 * командой
 * File[] files = new File(".").listFiles().
 * @see Chapter13.Examples.JGrep
 * date: 08.11.2022
 */
public class Exercise16 {
    private static void printFileContent(String filePath, String regex) {
        Pattern p = Pattern.compile(regex);
        int index = 0;
        Matcher m = p.matcher("");
        System.out.println("Start of the file!");
        System.out.println("----------------------------");
        for (String line : new TextFile(filePath)) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
        System.out.println("----------------------------");
        System.out.println("End of the file!");
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        args = new String[]{"src/Chapter13/Exercises", "\\b[Ssct]\\w+"};

        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        File file = new File(args[0]);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File directoryFile : files) {
                printFileContent(directoryFile.getPath(), args[1]);
            }
        } else {
            printFileContent(file.getPath(), args[1]);
        }
    }
}