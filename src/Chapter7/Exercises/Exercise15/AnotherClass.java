package Chapter7.Exercises.Exercise15;

import Chapter7.Exercises.Exercise15.ForExercise15.ForExercise15;

public class AnotherClass {
    public static void main(String[] args) {

        //! ForExercise15.printClass(); // Ошибка: printClass() has protected access in Chapter7.Exercises.Exercise15.ForExercise15.ForExercise15
        // Так как метод printClass() имеет модификатор доступа protected, то он не доступен для использования в классах,
        // находящихся вне пакета класса ForExercise15, за исключением классов-наследников ForExercise15.
    }
}
