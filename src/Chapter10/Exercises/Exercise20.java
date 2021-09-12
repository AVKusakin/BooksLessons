package Chapter10.Exercises;

/**
 * 20. Создайте интерфейс, содержащий вложенный класс. Реализуйте интерфейс и создайте экземпляр вложенного класса.
 * date: 12.09.2021
 */
public interface Exercise20 {
    class NestedClass implements Exercise20 {
        public static void main(String[] args) {
            NestedClass nestedClass = new NestedClass();
        }
    }
}