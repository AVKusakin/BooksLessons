package Chapter10.Exercises;

/**
 * 15. Создайте класс, не содержащий конструктор по умолчанию (конструктор без аргументов). При этом класс должен
 * содержать конструктор, получающий аргументы. Создайте второй класс с методом, который возвращает ссылку на объект первого
 * класса. Возвращаемый объект должен создаваться посредством анонимного внутреннего класса, производного от первого.
 * date: 11.09.2021
 */
class FirstClass {
    private String string;
    private void printString() {
        System.out.println(string);
    }

    public FirstClass(String string) {
        this.string = string;
    }
}

class SecondClass {
    private String string;

    public SecondClass(String string) {
        this.string = string;
    }

    public FirstClass getFirstClass() {
        return new FirstClass(string) {};
    }
}

public class Exercise15 {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass("This is SecondClass!");
        FirstClass firstClass = secondClass.getFirstClass();
    }
}