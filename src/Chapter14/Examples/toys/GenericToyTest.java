package Chapter14.Examples.toys;

//: typeinfo/toys/GenericToyTest.java
// Тестирование класса Class.

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // Создает точный тип:
        FancyToy fancyToy = ftClass.getDeclaredConstructor().newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // Не компилируется:
        // Class<Toy> up2 = ftClass.getSuperclass();
        // Создает только Object:
        Object obj = up.getDeclaredConstructor().newInstance();
    }
} ///:~