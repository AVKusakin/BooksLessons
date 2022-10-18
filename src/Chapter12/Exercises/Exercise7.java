package Chapter12.Exercises;

/**
 * 7. Измените упражнение 3 так, чтобы информация об исключении выводилась в блоке catch.
 * @see Chapter12.Exercises.Exercise3
 * date: 18.10.2022
 */
public class Exercise7 {
    public static void main(String[] args) {
        try {
            String[] strings = new String[1];
            String string = strings[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.err);
        }
    }
}