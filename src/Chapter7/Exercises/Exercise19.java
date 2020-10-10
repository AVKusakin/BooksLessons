package Chapter7.Exercises;

/**
 * 19. Создайте класс с пустой final-ссылкой на объект. Проведите инициализацию пустой константы во всех конструкторах.
 * Продемонстрируйте гарантированную инициализацию final перед использованием и невозможность её изменения после
 * инициализации.
 * date: 10.10.2020
 */
class ForExercise19 {
    private int i;
    ForExercise19(int i) {
        this.i = i;
    }
    public String toString() {
        return "ForExercise19 " + i;
    }
}

public class Exercise19 {
    private final ForExercise19 f;
    public Exercise19() {
        f = new ForExercise19(1);
    }
    public Exercise19(int i) {
        f = new ForExercise19(i);
    }
    public Exercise19(String s) {
        f = new ForExercise19(378);
    }
    public Exercise19(boolean b) {
        f = new ForExercise19(1293178349);
    }
    public static void main(String[] args) {
        Exercise19 e = new Exercise19(2);
        System.out.println(e.f);
        //! e.f = new ForExercise19(35); // Ошибка: cannot assign a value to final variable f
    }
}