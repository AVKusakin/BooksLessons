package Chapter5.Exercises;

/**
 * 19. Напишите метод, получающий список аргументов переменной длины с массивом String. Убедитесь в том, что этому методу
 * может передаваться как список объектов String, разделенных запятыми, так и String[].
 * date: 03.10.2020
 */
public class Exercise19 {
    static void f(String... args) {
        for (String s: args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] s = {"This", "is", "the", "first", "variant."};
        f(s);
        f("This", "is", "the", "second", "variant.");
    }
}