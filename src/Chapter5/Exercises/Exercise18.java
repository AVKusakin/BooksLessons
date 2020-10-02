package Chapter5.Exercises;

/**
 * 18. Завершите предыдущее упражнение - создайте объекты, которыми заполняется массив ссылок.
 * @see Chapter5.Exercises.Exercise17
 * date: 02.10.2020
 */
class ForEighteenthExercise {
    ForEighteenthExercise(String s) {
        System.out.println(s);
    }
}

public class Exercise18 {
    public static void main(String[] args) {
        ForEighteenthExercise[] f = new ForEighteenthExercise[10];
        for (int i = 0; i < f.length; i++) {
            f[i] = new ForEighteenthExercise(String.valueOf(i));
        }
    }
}