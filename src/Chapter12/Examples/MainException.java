package Chapter12.Examples;

//: exceptions/MainException.java
import java.io.*;

public class MainException {
    // Передаем все исключения на консоль:
    public static void main(String[] args) throws Exception {
        // Открываем файл:
        FileInputStream file = new FileInputStream("src/Chapter12/Examples/MainException.java");
        // Используем файл ...
        // Закрываем файл:
        file.close();
    }
} ///:~