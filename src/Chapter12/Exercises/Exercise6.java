package Chapter12.Exercises;

/**
 * 6. Создайте два класса исключения, каждый из которых автоматически выводит информацию о себе. Продемонстрируйте, что 
 * эти классы работают.
 * date: 18.10.2022
 */
class MyException1 extends Exception {
    public MyException1() {}
    public MyException1(String msg) {super(msg);}
    public String getMessage() {
        return "Подробное сообщение исключения: " + super.getMessage();
    }
}

class MyException2 extends Exception {
    public MyException2() {}
    public MyException2(String msg) {super(msg);}
    public String getMessage() {
        return "Подробное сообщение исключения: " + super.getMessage();
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        try {
            throw new MyException1("Это первое исключение!");
        } catch (MyException1 e) {
            e.printStackTrace(System.err);
        }
        try {
            throw new MyException2("Это второе исключение!");
        } catch (MyException2 e) {
            e.printStackTrace(System.err);
        }
    }
}