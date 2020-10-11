package Chapter7.Exercises;

/**
 * 23. Продемонстрируйте, что загрузка класса выполняется только один раз. Докажите, что загрузка может быть вызвана как
 * созданием первого экземпляра класса, так и обращением к статическому члену.
 * date: 11.10.2020
 */
class ForExercise23 {
    public static int i = 1;
}

public class Exercise23 {
    public int j = 1;
    public static void main(String[] args) {
        Exercise23 e = new Exercise23();
        System.out.println(e.j + ForExercise23.i);
    }
}