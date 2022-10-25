package Chapter12.Exercises;

import java.io.*;

/**
 * 26. Измените строку имени файла в примере MainException.java так, чтобы она содержала имя несуществующего файла.
 * Запустите программу и обратите внимание на результат.
 * @see Chapter12.Examples.MainException
 * date: 25.10.2022
 */
public class Exercise26 {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("src/Chapter12/Examples/Exception.java");
        file.close();
    }
} /* Output:
Exception in thread "main" java.io.FileNotFoundException: src\Chapter12\Examples\Exception.java (Не удается найти указанный файл)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	at Chapter12.Exercises.Exercise26.main(Exercise26.java:13)
*///:~