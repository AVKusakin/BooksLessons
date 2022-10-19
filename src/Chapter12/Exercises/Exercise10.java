package Chapter12.Exercises;

/**
 * 10. Создайте класс с двумя методами, f() и g(). В методе g() возбудите исключение того типа, который вы определили
 * ранее. В методе f() вызовите g(), перехватите исключение и в предложении catch возбудите новое исключение (второй тип,
 * который вам необходимо определить). Проверьте этот код в методе main().
 * date: 19.10.2022
 */
public class Exercise10 {
    public static void g() throws NullPointerException {
        System.out.println("Создание исключения в g()");
        throw new NullPointerException("из g()");
    }

    public static void f() {
        try {
            g();
        } catch (NullPointerException npe) {
            System.out.println("Создание исключения в f()");
            throw new ArrayIndexOutOfBoundsException("из f()");
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