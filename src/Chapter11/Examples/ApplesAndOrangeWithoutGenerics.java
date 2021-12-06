package Chapter11.Examples;

//: holding/ApplesAndOrangeWithoutGenerics.java
// Простой пример использования контейнера (с предупреждением компилятора).
// {ThrowsException}
import java.util.*;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange {}

public class ApplesAndOrangeWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Не мешает добавить Orange в apples:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++)
            ((Apple)apples.get(i)).id();
        // Объект Orange обнаруживается только во время выполнения
    }
} /* Output:
Exception in thread "main" java.lang.ClassCastException: Orange cannot be cast to Apple
*///:~