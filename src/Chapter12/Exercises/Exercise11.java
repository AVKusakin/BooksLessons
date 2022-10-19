package Chapter12.Exercises;

/**
 * 11. Повторите предыдущее упражнение, но на этот раз в предложении catch преобразуйте исключение метода g() в
 * RuntimeException.
 * @see Chapter12.Exercises.Exercise10
 * date: 19.10.2022
 */
public class Exercise11 {
    public static void g() throws NullPointerException {
        System.out.println("Создание исключения в g()");
        throw new NullPointerException("из g()");
    }

    public static void f() {
        try {
            g();
        } catch (NullPointerException npe) {
            System.out.println("Создание исключения в f()");
            throw new RuntimeException(npe);
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}