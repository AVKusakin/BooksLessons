package Chapter9.Exercises;

/**
 * 17. Покажите, что поля интерфейса автоматически являются статическими (static) и неизменными (final).
 * date: 21.10.2020
 */
interface Days {
    int MONDAY = 1, TUESDAY = 2, WEDNESDAY = 3, THURSDAY = 4, FRIDAY = 5, SATURDAY = 6, SUNDAY = 7;
}

public class Exercise17 implements Days {
    public static void main(String[] args) {
        //! WEDNESDAY = 58; // Ошибка: cannot assign a value to final variable WEDNESDAY
        //! this.WEDNSDAY = 58; // Ошибка: non-static variable this cannot be referenced from a static context
    }
}