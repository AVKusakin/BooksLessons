package Chapter10.Exercises;

/**
 * 23. Создайте интерфейс U с тремя методами. Создайте класс A с методом, который создаёт ссылку на U посредством
 * построения анонимного внутреннего класса. Создайте второй класс B, который содержит массив U. Класс B содержит один
 * метод, который получает и сохраняет ссылку на U в массиве; второй метод, который сбрасывает ссылку в массиве
 * (определяемую аргументом метода) в состояние null; и третий метод, который перебирает элементы массива и вызывает
 * методы U. В методе main() создайте группу объектов A и один объект B. Заполните объект B ссылками U, произведенными
 * объектами A. Используйте B для выполнения обратных вызовов по всем объектам A. Удалите некоторые ссылки на U из B.
 * date: 30.11.2021
 */
interface U {
    void firstMethod();
    void secondMethod();
    void thirdMethod();
}

class A {
    private int argumentA;

    public A(int argument) {
        argumentA = argument;
    }

    U makeU() {
        return new U() {
            public void firstMethod() {
                System.out.println("First Method with argument " + argumentA + ".");
            }

            public void secondMethod() {
                System.out.println("Second Method with argument " + argumentA + ".");
            }

            public void thirdMethod() {
                System.out.println("Third Method with argument " + argumentA + ".");
            }
        };
    }
}

class B {
    U[] array;

    U getU(int i) {
        if (i < array.length) {
            return array[i];
        }

        return null;
    }

    void dropU(int i) {
        if (i < array.length) {
            array[i] = null;
        }
    }

    void callMethodsOfU() {
        for (U u : array){
            if (u == null) {
                System.out.println("Element deleted.");
            } else {
                u.firstMethod();
                u.secondMethod();
                u.thirdMethod();
            }
        }
    }
}

public class Exercise23 {
    public static void main(String[] args) {
        A firstA = new A(1);
        A secondA = new A(2);
        A thirdA = new A(3);
        A fourthA = new A(4);

        B b = new B();
        b.array = new U[]{firstA.makeU(), secondA.makeU(), thirdA.makeU(), fourthA.makeU()};

        b.getU(2).firstMethod();
        System.out.println();
        b.callMethodsOfU();
        b.dropU(0);
        b.dropU(3);
        System.out.println();
        b.callMethodsOfU();
    }
}