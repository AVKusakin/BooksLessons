package Chapter5.Exercises;

import static net.mindview.util.Print.*;

/**
 * 15. Создайте класс, производный от String, инициализируемый в секции инициализации экземпляров.
 * date: 30.09.2020
 */
class ForFifteenthExercise {
    ForFifteenthExercise() {
        print("initialization...");
    }
}

public class Exercise15 {
    ForFifteenthExercise forFifteenthExercise;
    {
        forFifteenthExercise = new ForFifteenthExercise();
        print("end of initialization");
    }
    Exercise15() {
        print("Exercise15()");
    }
    public static void main(String[] args) {
        print("В методе main()");
        new Exercise15();
        print("The end.");
    }
}