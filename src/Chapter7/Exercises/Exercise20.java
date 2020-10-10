package Chapter7.Exercises;

/**
 * 20. Продемонстрируйте, что аннотация @Override решает проблему,упомянутую в соответствующем разделе книги.
 * date: 10.10.2020
 */
class ForExercise20 {
    public void calculate(int i, int j) {
        System.out.println("sum = " + (i + j));
    }
}

public class Exercise20 extends ForExercise20 {
    @Override
    public void calculate(int i, int j) {
        System.out.println("diff = " + (i - j));
    }
}