package Chapter10.Exercises.Exercise13;

/**
 * 13. Повторите упражнение 9 с анонимным внутренним классом.
 * @see Chapter10.Exercises.Exercise9
 * date: 11.09.2021
 */
public class Exercise13 {
    public Interface getInterface() {
        return new Interface() {
            public String getString() {
                return "String";
            }
        };
    }

    public static void main(String[] args) {
        Exercise13 e = new Exercise13();
        Interface i = e.getInterface();
        System.out.println(i.getString());
    }
}