package Chapter5.Exercises;

/**
 * 9. Подготовьте класс с двумя (перегруженными) конструкторами. Используя ключевое слово this, вызовите второй
 * конструктор из первого.
 * date: 19.09.2020
 */
public class NinthExercise {
    NinthExercise () {
        this(5);
    }
    NinthExercise (int x) {
        System.out.println("The number is " + x);
    }
    public static void main(String[] args) {
        NinthExercise ninthExercise = new NinthExercise();
    }
}