package Chapter10.Exercises;

import java.util.Date;

/**
 * 21. Создайте интерфейс с вложенным классом, содержащим статический метод, который вызывает методы вашего интерфейса и
 * выводит результаты. Реализуйте интерфейс и передайте экземпляр своей реализации методу.
 * date: 12.09.2021
 */
public interface Exercise21 {
    void printString();
    void printInteger();
    void printDate();

    class NestedClass1 implements Exercise21 {
        public void printString() {
            System.out.println("String!");
        }
        public void printInteger() {
            System.out.println(new Integer(10));
        }
        public void printDate() {
            System.out.println(new Date());
        }
    }

    class NestedClass2 {
        public static void printData(NestedClass1 nestedClass) {
            nestedClass.printString();
            nestedClass.printInteger();
            nestedClass.printDate();
        }

        public static void main(String[] args) {
            NestedClass1 nestedClass = new NestedClass1();
            printData(nestedClass);
        }
    }
}