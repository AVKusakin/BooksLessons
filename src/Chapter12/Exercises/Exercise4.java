package Chapter12.Exercises;

/**
 * 4. Создайте ваш собственный класс исключения, используя ключевое слово extends. Напишите конструктор, получающий
 * строковый аргумент, и сохраните этот аргумент внутри объекта поссылке на String. Напишите метод, который выводит эту
 * строку. Подсоедините новый блок try-catch для проверки нового исключения.
 * date: 17.10.2022
 */
class MyException extends Exception {
    private String message;

    public MyException() {}
    public MyException(String message) {this.message = message;}

    public String getMessage() {
        return message;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        try {
            throw new MyException("Special message!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}