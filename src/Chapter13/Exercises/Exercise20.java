package Chapter13.Exercises;

import java.util.*;

/**
 * 20. Создайте класс, содержащий поля типов int, long, float, double и String. Создайте для этого класса конструктор,
 * который получает один аргумент String, сканирует полученную строку и разбирает ее по разным полям. Добавьте метод
 * toString() и продемонстрируйте правильность работы своего класса.
 * date: 09.11.2022
 */
public class Exercise20 {
    private int intField;
    private long longField;
    private float floatField;
    private double doubleField;
    private String stringField;

    public Exercise20(String arg) {
        Scanner scanner = new Scanner(arg);
        intField = scanner.nextInt();
        longField = scanner.nextLong();
        floatField = scanner.nextFloat();
        doubleField = scanner.nextDouble();
        stringField = scanner.next();
    }

    public String toString() {
        return "intField = " + intField + ";\nlongField = " + longField + "l;\nfloatField = " + floatField + "f;\ndoubleField = "
                + doubleField + "d;\nstringField = " + stringField + ".";
    }

    public static void main(String[] args) {
        Exercise20 exercise = new Exercise20("3 58 25,79 472,915 String");
        System.out.println(exercise);
    }
}