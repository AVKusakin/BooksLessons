package Chapter13.Exercises;

import java.util.*;

/**
 * 5. Для каждого базового типа преобразования в приведенной таблице напишите самое сложное из возможных выражений
 * форматирования. Другими словами, используйте все возможные форматные спецификаторы, доступные для этого типа преобразования.
 * date: 02.11.2022
 */
public class Exercise5 {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);

        int v = 121;
        System.out.println("v = 121");
        f.format("d: %1$+4d\n", v);
        f.format("c: %1$4c\n", v);
        f.format("b: %1$4b\n", v);
        f.format("s: %1$4s\n", v);
        f.format("x: %1$4x\n", v);
        f.format("h: %1$4h\n", v);

        double x = -179.54321;
        System.out.println("x = 179.54321");
        f.format("f: %1$+4.5f\n", x);
        f.format("e: %1$+4.5e\n", x);
    }
}