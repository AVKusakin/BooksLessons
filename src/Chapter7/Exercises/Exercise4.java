package Chapter7.Exercises;

import static net.mindview.util.Print.*;

/**
 * 4. Докажите, что конструкторы базового класса: (а) всегда вызываются и (б) всегда вызываются перед исполнением
 * конструкторов производного класса.
 * date: 07.10.2020
 */
class ForExercise4 {
    ForExercise4() {
        print("Конструктор ForExercise4");
    }
}

public class Exercise4 extends ForExercise4{
    Exercise4() {
        print("Конструктор Exercise4");
    }
    public static void main(String[] args) {
        Exercise4 x = new Exercise4();
    }
}