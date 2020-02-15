package Chapter2.Exercises;

/**
 * 6. Напишите программу, включающую метод storage(), приведенный ранее в этой главе.
 * date: 15.02.2020
 */
public class SixthExercise {
    public static void main(String[] args) {
        SixthExercise sixthExercise = new SixthExercise();
        String hello = new String("Hello, World!");
        System.out.println("The method \"storage\", applied to the string \"hello\", should return 26. In fact, " +
                "it returns " + sixthExercise.storage(hello) + ".");
    }

    int storage(String s) {
        return s.length() * 2;
    }
}