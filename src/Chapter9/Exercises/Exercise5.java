package Chapter9.Exercises;

import Chapter9.Exercises.ForExercise5.ForExercise5;

/**
 * 5. Создайте интерфейс, содержащий три метода, в отдельном пакете. Реализуйте этот интерфейс в другом пакете.
 * @see Chapter9.Exercises.ForExercise5.ForExercise5
 * date: 18.10.2020
 */
public class Exercise5 implements ForExercise5 {
    @Override
    public void firstMethod() {
        System.out.println("Exercise5.firstMethod()");
    }

    @Override
    public void secondMethod() {
        System.out.println("Exercise5.secondMethod()");
    }

    @Override
    public void thirdMethod() {
        System.out.println("Exercise5.thirdMethod()");
    }

    public static void main(String[] args) {
        Exercise5 e = new Exercise5();
        e.firstMethod();
        e.secondMethod();
        e.thirdMethod();
    }
}