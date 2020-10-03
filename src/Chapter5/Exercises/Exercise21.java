package Chapter5.Exercises;

/**
 * 21. Создайте перечисление с названиями шести типов бумажных денег. Переберите результат values() с выводом каждого
 * значения и его ordinal().
 * @see Chapter5.Exercises.ForExercises21And22
 * date: 03.10.2020
 */
public class Exercise21 {
    public static void main(String[] args) {
        for (ForExercises21And22 f : ForExercises21And22.values())
            System.out.println(f + ", ordinal " + f.ordinal());
    }
}