package Chapter12.Exercises;

/**
 * 19. Исправьте недостаток LostMessage.java, защитив вызов в блоке finally.
 * @see Chapter12.Examples.LostMessage
 * date: 21.10.2022
 */
class VeryImportantException2 extends Exception {
    public String toString() {
        return "Очень важное исключение!";
    }
}

class HoHumException2 extends Exception {
    public String toString() {
        return "Второстепенное исключение";
    }
}

public class Exercise19 {
    void f() throws VeryImportantException2 {
        throw new VeryImportantException2();
    }
    void dispose() throws HoHumException2 {
        throw new HoHumException2();
    }
    public static void main(String[] args) {
        try {
            Exercise19 lm = new Exercise19();
            try {
                lm.f();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}