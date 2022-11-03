package Chapter13.Exercises;

/**
 * 9. Взяв за основу документацию java.util.regex.Pattern, замените все гласные в Splitting.knights подчеркиваниями.
 * @see java.util.regex.Pattern
 * @see Chapter13.Examples.Splitting
 * date: 03.11.2022
 */
public class Exercise9 {
    static String s = Chapter13.Examples.Splitting.knights;
    public static void main(String[] args) {
        System.out.println(s.replaceAll("(?i:[aeiouy])", "_"));
    }
}