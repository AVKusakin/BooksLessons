package Chapter12.Exercises;

/**
 * 8. Напишите класс с методом, который возбуждает исключение, созданное вами в упражнении 4. Попробуйте откомпилировать
 * его без спецификации исключений и посмотрите, что «скажет» компилятор. После этого добавьте необходимую спецификацию
 * исключений. Протестируйте свой класс и его исключение внутри блока try-catch.
 * @see Chapter12.Exercises.Exercise4
 * date: 18.10.2022
 */
public class Exercise8 {
    public static void firstMethod() {
        //! throw new MyException(); java: unreported exception Chapter12.Exercises.MyException; must be caught or declared to be thrown
    }
    public static void secondMethod() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            secondMethod();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}