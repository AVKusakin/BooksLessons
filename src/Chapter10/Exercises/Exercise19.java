package Chapter10.Exercises;

/**
 * 19. Создайте класс, содержащий внутренний класс, который, в свою очередь, содержит вложенный класс. Повторите управление
 * с вложенными классами. Обратите внимание на имена файлов .class, создаваемых компилятором.
 * date: 12.09.2021
 */
public class Exercise19 {
    public class InnerClass {
        //! java: modifier static not allowed here
        //! static class NestedClass {
        //!    public static void f() {}
        //! }
    }

    public static void main(String[] args) {
        //! InnerClass.NestedClass nestedClass = new InnerClass.NestedClass();
    }
}