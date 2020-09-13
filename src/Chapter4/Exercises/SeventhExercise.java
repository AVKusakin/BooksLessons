package Chapter4.Exercises;

/**
 * 7. Измените упражнение 1 так, чтобы выход из программы осуществлялся ключевым словом break при значении 99.
 * Попробуйте использовать ключевое слово return.
 * @see Chapter4.Exercises.FirstExercise
 * date: 13.09.2020
 */
public class SeventhExercise {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 99) {
                break;
//                return;
            }
            System.out.println(i);
        }
    }
}