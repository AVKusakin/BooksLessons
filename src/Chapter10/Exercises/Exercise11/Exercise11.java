package Chapter10.Exercises.Exercise11;

/**
 * 11. Создайте закрытый внутренний класс, реализующий открытый интерфейс. Напишите метод, который возвращает ссылку на
 * экземпляр закрытого внутреннего класса, преобразованную к интерфейсу восходящим преобразованием. Чтобы показать, что
 * внутренний класс полностью скрыт, попробуйте выполнить нисходящее преобразование к нему.
 * date: 15.03.2021
 */
public class Exercise11 {
    private class InnerClass implements Interface {}
    public Interface getInnerClass() {
        return new InnerClass();
    }

    public static void main(String[] args) {
        Exercise11 e = new Exercise11();
        Interface i = e.getInnerClass();
        InnerClass innerClass = (InnerClass) e.getInnerClass();
    }
}