package Chapter2.Exercises;

/**
 * 3. Найдите фрагмент кода с классом ATypeName и сделайте из него программу,
 * пригодную для компиляции и запуска.
 * date: 15.02.2020
 */
public class ThirdExercise {

    public static class ATypeName {
        public static void main(String[] args) {
            ATypeName aTypeName = new ATypeName();
            System.out.println("This is exercise 3.");
            System.out.println("It just creates the object: " + aTypeName.toString() + ".");
            System.out.println("The End.");
        }
    }
}