package Chapter3.Exercises;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * 7. Напишите программу, моделирующую бросок монетки.
 * date: 06.09.2020
 */
public class Exercise7 {
    public static void main(String[] args) {
        Random rand = new Random(2);
        boolean size = rand.nextBoolean();
        print("Бросок монетки...");
        print(size == true ? "Орёл" : "Решка");
    }
}