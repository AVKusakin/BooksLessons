package Chapter12.Exercises;

/**
 * 18. Добавьте в LostMessage.java второй уровень потери исключений, чтобы исключение HoHumException само замещалось
 * третьим исключением.
 * @see Chapter12.Examples.LostMessage
 * date: 21.10.2022
 */
class VeryImportantException extends Exception {
    public String toString() {
        return "Очень важное исключение!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "Второстепенное исключение";
    }
}

class NewException extends Exception {
    public String toString() {
        return "Третьестепенное исключение";
    }
}

public class Exercise18 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    void replace() throws NewException {
        throw new NewException();
    }

    public static void main(String[] args) {
        try {
            Exercise18 lm = new Exercise18();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } finally {
                    lm.replace();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}