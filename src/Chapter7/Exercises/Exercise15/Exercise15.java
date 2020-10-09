package Chapter7.Exercises.Exercise15;

import Chapter7.Exercises.Exercise15.ForExercise15.ForExercise15;

/**
 * 15. Создайте класс в пакете. Ваш класс должен содержать метод со спецификатором protected. Попытайтесь вызвать метод
 * protected за пределами пакета, и объясните, что происходит. Затем создайте класс, производный от вашего, и вызовите
 * метод protected из другого метода вашего производного класса.
 * @see Chapter7.Exercises.Exercise15.ForExercise15.ForExercise15
 * @see Chapter7.Exercises.Exercise15.AnotherClass
 * date: 09.10.2020
 */
public class Exercise15 extends ForExercise15 {
    public static void main(String[] args) {
        ForExercise15.printClass();
    }
}