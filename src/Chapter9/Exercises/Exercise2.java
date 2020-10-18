package Chapter9.Exercises;

/**
 * 2. Создайте класс и объявите его как abstract, не включая в него ни одного абстрактного метода. Затем убедитесь, что
 * вы не можете создавать экземпляры этого класса.
 * date: 18.10.2020
 */
abstract class ForExercise2 {
    public void notAbstractMethod() {
        System.out.println("ForExercise2.notAbstractMethod()");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        //! ForExercise2 f = new ForExercise2(); // Ошибка: Chapter9.Exercises.ForExercise2 is abstract; cannot be instantiated
    }
}