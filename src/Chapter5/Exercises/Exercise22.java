package Chapter5.Exercises;

/**
 * 22. Напишите команду switch для перечисления из предыдущего примера. Для каждого случая выведите расширенное описание
 * конкретной валюты.
 * @see Chapter5.Exercises.ForExercises21And22
 * @see Chapter5.Exercises.Exercise21
 * date: 03.10.2020
 */
public class Exercise22 {
    ForExercises21And22 banknote;
    public Exercise22(ForExercises21And22 banknote) {
        this.banknote = banknote;
    }
    public void describe() {
        System.out.print("This banknote is ");
        switch (banknote) {
            case RUBLE:     System.out.println("Ruble. It used in Russian Federation.");
                            break;
            case DOLLAR:    System.out.println("Dollar. It used mostly in United States of America.");
                            break;
            case EURO:      System.out.println("Euro. It used mostly in European countries.");
                            break;
            case POUND:     System.out.println("Pound. It used in Great Britain.");
                            break;
            case TENGE:     System.out.println("Tenge. It used in many Asian countries. Particularly in Kazakhstan.");
                            break;
            case YUAN:      System.out.println("Yuan. It used in Сhina.");
                            break;
        }
    }
    public static void main(String[] args) {
        Exercise22
                ruble = new Exercise22(ForExercises21And22.RUBLE),
                dollar = new Exercise22(ForExercises21And22.DOLLAR),
                euro = new Exercise22(ForExercises21And22.EURO),
                pound = new Exercise22(ForExercises21And22.POUND),
                tenge = new Exercise22(ForExercises21And22.TENGE),
                yuan = new Exercise22(ForExercises21And22.YUAN);
        ruble.describe();
        dollar.describe();
        euro.describe();
        pound.describe();
        tenge.describe();
        yuan.describe();
    }
}