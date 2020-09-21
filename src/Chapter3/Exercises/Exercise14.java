package Chapter3.Exercises;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * 14. Напишите метод, который получает два аргумента String, выполняет с ними все операции логических сравнений и
 * выводит результаты. Для операций == и != также выполните проверку equals(). Вызовите свой метод из main() для
 * нескольких разных объектов String.
 * date: 11.09.2020
 */
public class Exercise14 {
    static void logicalOperations(String x, String y) {
        List<Boolean> results = new ArrayList<>();
        //! x > y;
        //! x >= y;
        //! x < y;
        //! x <= y;
        boolean a = x == y;
        boolean b = x != y;
        boolean c = x.equals(y);
        //! !y;
        //! x && y;
        //! x = x || y;
        print(x + " == " + y + ": " + a);
        print(x + " != " + y + ": " + b);
        print(x + " equals " + y + ": " + c);
        print("");
    }
    public static void main(String[] args) {
        logicalOperations("First","Second");
        logicalOperations("Скамейка","Скамейка");
        logicalOperations(new String("Скамейка"),new String("Скамейка"));
    }
}