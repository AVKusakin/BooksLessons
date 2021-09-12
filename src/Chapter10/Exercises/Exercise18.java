package Chapter10.Exercises;

/**
 * 18. Создайте класс, содержащий вложенный класс. Создайте в методе main() экзмепляр вложенного класса.
 * date: 12.09.2021
 */
public class Exercise18 {
    public static class NestedClass {
        public static void f() {}
        static String s = "String";
        static class AnotherLevel {
            public static void f() {}
            static String s = "String";
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
    }
}