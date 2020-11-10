package Chapter10.Exercises;

/**
 * 3. Измените упражнение 1 так, чтобы класс Outer содержал закрытое поле String (инициализируемое в конструкторе), а
 * класс Inner содержал метод toString() для вывода этого поля. Создайте объект типа Inner и выведите его.
 * @see Chapter10.Exercises.Exercise1
 * date: 10.11.2020
 */
class Outer2 {
    private String string;
    public Outer2() {
        string = "new String";
    }
    class Inner {
        @Override
        public String toString() {
            return string;
        }
    }
    public Inner getInner() {
        return new Inner();
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        System.out.println(outer.getInner());
    }
}