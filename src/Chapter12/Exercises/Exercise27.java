package Chapter12.Exercises;

/**
 * 27. Измените упражнение 3 и преобразуйте исключение в RuntimeException.
 * @see Chapter12.Exercises.Exercise3
 * date: 25.10.2022
 */
public class Exercise27 {
    public static void main(String[] args) {
        try {
            String[] strings = new String[1];
            String string = strings[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}