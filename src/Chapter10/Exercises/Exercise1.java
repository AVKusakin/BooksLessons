package Chapter10.Exercises;

/**
 * 1. Напишите класс с именем Outer, содержащий внутренний класс с именем Inner. Добавьте в Outer метод, возвращающий
 * объект типа Inner. В методе main() создайте и инициализируйте ссылку на Inner.
 * date: 31.10.2020
 */
class Outer {
    class Inner {}
    public Inner getInner() {
        System.out.println("Outer.getInner()");
        return new Inner();
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.getInner();
    }
}