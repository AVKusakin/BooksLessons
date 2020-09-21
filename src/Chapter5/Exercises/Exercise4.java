package Chapter5.Exercises;

import static net.mindview.util.Print.*;

/**
 * 4. Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий в качестве параметра строку (String) и
 * распечатывающий ее вместе сообщением.
 * @see Chapter5.Exercises.Exercise3
 * date: 16.09.2020
 */
class ForFourthExercise {
    ForFourthExercise() {
        print("Сообщение!");
    }
    ForFourthExercise(String s) {
        print("Сообщение и " + s + "!");
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        ForFourthExercise f = new ForFourthExercise("какая-то строка");
    }
}