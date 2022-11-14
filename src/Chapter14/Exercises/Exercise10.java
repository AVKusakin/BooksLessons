package Chapter14.Exercises;

/**
 * 10. Напишите программу, которая определяет, является ли массив char примитивным типом или «настоящим» объектом.
 * date: 14.11.2022
 */
public class Exercise10 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd'};
        Class clazz = chars.getClass();
        System.out.println("Array of chars is primitive: " + clazz.isPrimitive());
    }
}