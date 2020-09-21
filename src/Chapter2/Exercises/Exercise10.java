package Chapter2.Exercises;

/**
 * 10. Напишите программу, которая выводит три параметра командной строки. Для получения аргументов вам потребуется
 * обращение к элементам массива строк (String).
 * date: 15.02.2020
 */
public class Exercise10 {
    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "First";
        array[1] = "Second";
        array[2] = "Third";
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
    }
}