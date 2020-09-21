package Chapter2.Exercises;

/**
 * 5. Измените упражнение 4 так, чтобы данным класса DataOnly присваивались значения,
 * а затем распечатайте их в методе main().
 * date: 15.02.2020
 */
public class Exercise5 {

    public static class DataOnly {
        int i;
        double d;
        boolean b;

        public static void main(String[] args) {
            Exercise4.DataOnly dataOnly = new Exercise4.DataOnly();
            dataOnly.i = 22;
            dataOnly.d = 375d;
            dataOnly.b = true;
            System.out.println("This is exercise 4.");
            System.out.println("It just creates the object with some fields: " + dataOnly.toString() + ".");
            System.out.println("The fields are: i(int) = " + dataOnly.i
                    + ", d(double) = " + dataOnly.d
                    + " and b(boolean) = " + dataOnly.b + ".");
            System.out.println("The End.");
        }
    }
}