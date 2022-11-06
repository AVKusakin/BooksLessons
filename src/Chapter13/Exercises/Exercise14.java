package Chapter13.Exercises;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * 14. Перепишите класс SplitDemo с использованием String.split().
 * @see Chapter13.Examples.SplitDemo
 * date: 06.11.2022
 */
public class Exercise14 {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(input.split("!!")));
        print(Arrays.toString(input.split("!!", 3)));
    }
}