package Chapter12.Exercises;

/**
 * 5. Создайте собственную реализацию модели возобновления, используя цикл while, который выполняется до тех пор, пока
 * исключение не перестанет выдаваться.
 * date: 17.10.2022
 */
public class Exercise5 {
    public static void main(String[] args) {
        String[] strings = new String[10];
        int i = 15;

        while (true) {
            try {
                System.out.println(strings[i--]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index " + (i + 1) + " out of bounds for arrays length!");
                continue;
            }
            break;
        }
    }
}