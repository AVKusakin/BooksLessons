package Chapter9.Exercises.Exercise13;

/**
 * 13. Создайте интерфейс и определите два новых интерфейса, производных от него. Выполните множественное наследование
 * третьего интерфейса от первых двух.
 * date: 20.10.2020
 */
public class Exercise13 implements FirstInterface, SecondInterface, ThirdInterface {
    @Override
    public void doSomething() {
        System.out.println("Exercise13.doSomething()");
    }
    public static void main(String[] args) {
        FirstInterface firstInterface = new Exercise13();
        SecondInterface secondInterface = new Exercise13();
        ThirdInterface thirdInterface = new Exercise13();

        firstInterface.doSomething();
        secondInterface.doSomething();
        thirdInterface.doSomething();
    }
}