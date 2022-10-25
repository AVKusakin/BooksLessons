package Chapter12.Exercises;

/**
 * 30. Измените пример Human.java так, чтобы исключения наследовали от RuntimeException. Измените метод main() так, чтобы 
 * приём из примера TurnOffChecking.java использовался для обработки разных типов исключений.
 * @see Chapter12.Examples.Human
 * @see Chapter12.Examples.TurnOffChecking
 * date: 25.10.2022
 */
class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

public class Exercise30 {
    static void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0: throw new Annoyance();
                case 1: throw new Sneeze();
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            throwRuntimeException(0);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throwRuntimeException(1);
        }
    }
}