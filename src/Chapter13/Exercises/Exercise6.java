package Chapter13.Exercises;

/**
 * 6. Создайте класс с полями int, long, float, double. Создайте для этого класса метод toString(), использующий
 * String.format(), и продемонстрируйте, что ваш класс работает правильно.
 * date: 03.11.2022
 */
public class Exercise6 {
    private int intField = 127;
    private long longField = 3965l;
    private float floatField = 932.41f;
    private double doubleField = 60.58;

    public String toString() {
        return String.format("intField: %d\nlongField: %d\nfloatField: %f\ndoubleField: %f", intField, longField,
                floatField, doubleField);
    }

    public static void main(String[] args) {
        Exercise6 exercise = new Exercise6();
        System.out.println(exercise);
    }
}