package Chapter6.Exercises;

import Chapter6.Exercises.ForExercise5.ForExercise5;

/**
 * 5. Создайте класс с полями и методами, обладающими разными уровнями доступа: public, private, protected, доступом в
 * пределах пакета. Создайте объект этого класса и посмотрите, какие сообщения выдаёт компилятор при попытке обращения
 * к разным членам класса. Учтите, что классы, находящиеся в одном каталоге, входят в пакет по умолчанию.
 * @see Chapter6.Exercises.ForExercise5.ForExercise5
 * date: 04.10.2020
 */
public class Exercise5 {
    public static void main(String[] args) {
        ForExercise5 forExercise5 = new ForExercise5();
        forExercise5.showInt();
        //! forExercise5.showString(); // Ошибка: showString() has private access in Chapter6.Exercises.ForExercise5.ForExercise5
        //! forExercise5.showBoolean(); // Ошибка: showBoolean() has protected access in Chapter6.Exercises.ForExercise5.ForExercise5
        //! forExercise5.showChar(); // Ошибка: showChar() is not public in Chapter6.Exercises.ForExercise5.ForExercise5;
        // cannot be accessed from outside package
    }
}