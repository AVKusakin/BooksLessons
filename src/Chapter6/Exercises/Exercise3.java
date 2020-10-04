package Chapter6.Exercises;

import static Chapter6.Exercises.debug.ForExercise3.*;
import static Chapter6.Exercises.debugoff.ForExercise3.*;

/**
 * 3. Создайте два пакета debug и debugoff, содержащие одинаковые классы с методом debug(). Первая версия выводит на
 * консоль свой аргумент типа String, вторая не делает ничего. Используйте директиву static import для импортирования
 * класса в тестовую программу и продемонстрируйте эффект условной компиляции.
 * @see Chapter6.Exercises.debug.ForExercise3
 * @see Chapter6.Exercises.debugoff.ForExercise3
 * date: 04.10.2020
 */
public class Exercise3 {
    public static void main(String[] args) {
        debug();
        debug("String");
    }
}