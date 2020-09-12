package Chapter4.Exercises;

import java.util.Random;

/**
 * 3. Измените упражнение 2 так, чтобы код выполнялся в «бесконечом» цикле while. Программа должна работать до тех пор,
 * пока ее выполнение не будет прервано с клавиатуры (как правило, нажатием клавиш Ctrl+C).
 * date: 12.09.2020
 */
public class ThirdExercise {
    public static void main(String[] args) {
        while (true) {
            int x = new Random().nextInt();
            int y = new Random().nextInt();
            System.out.println("x = " + x + "; y = " + y);
            if (x > y) {
                System.out.println("x is bigger than y");
            } else if (x < y) {
                System.out.println("x is smaller than y");
            } else {
                System.out.println("x equals y");
            }
        }
    }
}