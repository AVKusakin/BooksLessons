package Chapter12.Exercises;

/**
 * 13. Измените упражнение 9, добавив туда блок finally. Проверьте, что блок выполняется даже в случае возбуждения
 * NullPointerException.
 * @see Chapter12.Exercises.Exercise9
 * date: 20.10.2022
 */
class FourthException extends Exception {}
class FifthException extends Exception {}
class SixthException extends Exception {}

public class Exercise13 {
    public static void throwExceptions() {
        try {
            throw new FourthException();
        } catch (FourthException f) {
            try {
                f.printStackTrace();
                throw new FifthException();
            } catch (FifthException s) {
                try {
                    s.printStackTrace();
                    throw new SixthException();
                } catch (SixthException t) {
                    t.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            throwExceptions();
        } catch (Exception e) {
        } finally {
            try {
                throw new NullPointerException();
            } catch (NullPointerException npe) {
            } finally {
                System.out.println("Блок finally после NullPointerException.");
            }
            System.out.println("Блок finally.");
        }
    }
}