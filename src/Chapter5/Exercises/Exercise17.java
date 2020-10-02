package Chapter5.Exercises;

/**
 * 17. Создайте класс с конструктором, получающим аргумент String. Выведите значение аргумента во время конструирования.
 * Создайте массив ссылок на этот класс, но не создавайте объекты, которыми заполняется массив. Запустите программу и
 * посмотрите, будут ли выводиться сообщения при вызове конструкторов.
 * date: 02.10.2020
 */
class ForSeventeenthExercise {
    ForSeventeenthExercise(String s) {
        System.out.println(s);
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        ForSeventeenthExercise[] f = new ForSeventeenthExercise[10];
    }
} // В такой ситуации при вызове конструкторов сообщения выводиться не будут.