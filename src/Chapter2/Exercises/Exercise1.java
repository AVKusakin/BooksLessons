package Chapter2.Exercises;

/**
 * 1. Создайте класс с полями int и char, которые не инициализируются в программе.
 * Выведите их значения, чтобы убедиться в том,что Java выполняет инициализацию по умолчанию.
 * date: 15.02.2020
 */
public class Exercise1 {

   public static int i;
   public static char c;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(c);
    }
}