package Chapter10.Exercises.Exercise9;

/**
 * 9. Создайте интерфейс, содержащий минимум один метод. Реализуйте его, определяя внутренний класс в методе, который
 * возвращает ссылку на ваш интерфейс.
 * date: 15.03.2021
 */
public class Exercise9 {
    public Interface getInterface() {
        class InnerClass implements Interface {
            @Override
            public String getString() {
                return "String";
            }
        }

        return new InnerClass();
    }

    public static void main(String[] args) {
        Exercise9 e = new Exercise9();
        Interface i = e.getInterface();
        System.out.println(i.getString());
    }
}