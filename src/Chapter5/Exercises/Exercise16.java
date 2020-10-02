package Chapter5.Exercises;

/**
 * 16. Создайте массив объектов String. Присвойте объект String каждому элементу. Выведите содержимое массива в цикле for.
 * date: 02.10.2020
 */
public class Exercise16 {
    public static void main(String[] args) {
        String[] a = new String[10];
        for (int i = 0; i < a.length; i++)
            a[i] = String.valueOf(i);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}