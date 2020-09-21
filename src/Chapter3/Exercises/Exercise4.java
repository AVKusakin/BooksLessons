package Chapter3.Exercises;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * 4. Напишите программу, которая вычисляет скорость для постоянных значений расстояния и времени.
 * date: 06.09.2020
 */
public class Exercise4 {
    public static void main(String[] args) {
        // Пусть v - скорость (м/с), s - расстояние (м), а t - время (с).
        // Тогда скорость вычисляется по формуле v = s / t.
        float v, s, t;
        Random rand = new Random(200);
        s = rand.nextFloat();
        t = rand.nextFloat();
        v = s / t;
        print("При прохождении расстояния s = " + s + " м за время t = " + t +
                " c скорость движущегося тела составляла v = " + v + " м/с.");
    }
}