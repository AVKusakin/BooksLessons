package Chapter12.Exercises;

/**
 * 1. Создайте класс с методом main(), возбуждающим исключение типа Exception из блока try. Задайте в конструкторе для
 * Exception строковый аргумент. Перехватите исключение в блоке catch и распечатайте текст аргумента. Добавьте блок finally
 * и выведите сообщение как доказательство его выполнения.
 * date: 17.10.2022
 */
public class Exercise1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Исключение!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Выполнение блока finally.");
        }
    }
}