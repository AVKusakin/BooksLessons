package Chapter13.Exercises;

/**
 * 7. Взяв за основу документацию java.util.regex.Pattern, напишите и протестируйте регулярное выражение, которое проверяет,
 * что предложение начинается с прописной буквы и завершается точкой.
 * @see java.util.regex.Pattern
 * date: 03.11.2022
 */
public class Exercise7 {
    private static String sentence = "Предложение для проверки регулярным выражением.";

    public static void main(String[] args) {
        System.out.println(sentence.matches("[А-Я].+\\."));
    }
}