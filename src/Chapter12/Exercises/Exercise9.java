package Chapter12.Exercises;

/**
 * 9. Создайте три новых типа исключений. Напишите класс с методом, возбуждающим каждое из них. В методе main() вызовите
 * этот метод, используя одно предложение catch, способное перехватить все три исключения.
 * date: 19.10.2022
 */
class FirstException extends Exception {}
class SecondException extends Exception {}
class ThirdException extends Exception {}

public class Exercise9 {
    public static void throwExceptions() {
        try {
            throw new FirstException();
        } catch (FirstException f) {
            try {
                f.printStackTrace();
                throw new SecondException();
            } catch (SecondException s) {
                try {
                    s.printStackTrace();
                    throw new ThirdException();
                } catch (ThirdException t) {
                    t.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            throwExceptions();
        } catch (Exception e) {
        }
    }
}