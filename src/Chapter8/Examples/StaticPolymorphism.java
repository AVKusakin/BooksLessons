package Chapter8.Examples;

//: polymorphism/StaticPolymorphism.java
// Статические методы не являются полиморфными.

class StaticSuper {
    public static String staticGet() {
        return "Базовая версия staticGet()";
    }
    public static String dynamicGet() {
        return "Базовая версия dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Производная версия staticGet()";
    }
    public static String dynamicGet() {
        return "Производная версия dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Восходящее преобразование
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
} /* Output:
Базовая версия staticGet()
Базовая версия dynamicGet()
*///:~