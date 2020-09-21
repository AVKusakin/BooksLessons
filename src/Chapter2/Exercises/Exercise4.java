package Chapter2.Exercises;

/**
 * 4. Сделайте то же для кода с использованием класса DataOnly.
 * date: 15.02.2020
 */
public class Exercise4 {

    public static class DataOnly {
        int i;
        double d;
        boolean b;

        public static void main(String[] args) {
            DataOnly dataOnly = new DataOnly();
            System.out.println("This is exercise 4.");
            System.out.println("It just creates the object with some fields: " + dataOnly.toString() + ".");
            System.out.println("The fields are: i(int) = " + dataOnly.i
                    + ", d(double) = " + dataOnly.d
                    + " and b(boolean) = " + dataOnly.b + ".");
            System.out.println("The End.");
        }
    }
}