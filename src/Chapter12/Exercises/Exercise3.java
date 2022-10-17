package Chapter12.Exercises;

/**
 * 3. Напишите код, который генерирует и перехватывает исключение ArrayIndexOutOfBoundsException.
 * date: 17.10.2022
 */
public class Exercise3 {
    public static void main(String[] args) {
        try {
            String[] strings = new String[1];
            String string = strings[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехваченное исключение ArrayIndexOutOfBoundsException!");
        }
    }
}