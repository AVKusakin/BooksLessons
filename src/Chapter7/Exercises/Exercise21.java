package Chapter7.Exercises;

/**
 * 21. Создайте класс с неизменным (final) методом. Создайте производный класс и попытайтесь переопределить этот метод.
 * date: 10.10.2020
 */
class ForExercise21 {
    final void hello(String s) {
        System.out.println("Hello, " + s);
    }
}

public class Exercise21 extends ForExercise21 {
    //! final void hello(String s) { // Ошибка: hello(java.lang.String) in Chapter7.Exercises.Exercise21 cannot override
    //  overridden method is final   // hello(java.lang.String) in Chapter7.Exercises.ForExercise21
    //!    System.out.println("Hello, " + s);
    //! }
}