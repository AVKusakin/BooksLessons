package Chapter5.Exercises;

import static net.mindview.util.Print.*;

/**
 * 3. Создайте класс с конструктором по умолчанию (без параметров), который выводит на экран сообщение. Создайте объект
 * этого класса.
 * date: 16.09.2020
 */
class ForThirdExercise {
    ForThirdExercise() {
        print("Сообщение!");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        ForThirdExercise f = new ForThirdExercise();
    }
}