package Chapter7.Exercises;

import static net.mindview.util.Print.*;

/**
 * 3. Докажите утвеждение: "Даже если конструктор класса Cartoon не определён, компилятор сгенерирует конструктор по
 * умолчанию, в котором также вызывается конструктор базового класса".
 * @see Chapter7.Examples.Cartoon
 * date: 07.10.2020
 */
class ForExercise3 {
    ForExercise3() {
        print("Конструктор ForExercise3");
    }
}

public class Exercise3 extends ForExercise3 {
    public static void main(String[] args) {
        Exercise3 x = new Exercise3();
    }
}