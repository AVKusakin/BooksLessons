package Chapter12.Exercises;

/**
 * 28. Измените упражнение 4 так, чтобы класс исключения был производным от RuntimeException. Покажите, что компилятор
 * позволяет опустить блок try.
 * @see Chapter12.Exercises.Exercise4
 * date: 25.10.2022
 */
class MyException3 extends RuntimeException {
    private String message;

    public MyException3() {}
    public MyException3(String message) {this.message = message;}

    public String getMessage() {
        return message;
    }
}

public class Exercise28 {
    public static void main(String[] args) {
        throw new MyException3("Special message!");
    }
}