package Chapter9.Exercises;

/**
 * 14. Создайте три интерфейса, каждый из которых содержит два метода. Объявите новый интерфейс, производный от первых
 * трех, включите в него новый метод. Создайте класс, который реализует новый интерфейс, а также является производным от
 * конкретного класса. Напишите четыре метода, каждый из которых получает один из четырех интерфейсов в аргументе.
 * Создайте в main() объект этого класса и передайте его каждому из методов.
 * date: 20.10.2020
 */
interface FirstInterface {
    void fifm(); // fifm - first interface first method
    void fism();
}

interface SecondInterface {
    void sifm();
    void sism();
}

interface ThirdInterface {
    void tifm();
    void tism();
}

interface FourthInterface extends FirstInterface, SecondInterface, ThirdInterface {
    void newMethod();
}

class FirstClass {}

class SecondClass extends FirstClass implements FourthInterface {
    @Override
    public void fifm() {}

    @Override
    public void fism() {}

    @Override
    public void sifm() {}

    @Override
    public void sism() {}

    @Override
    public void tifm() {}

    @Override
    public void tism() {}

    @Override
    public void newMethod() {}
}

public class Exercise14 {
    public void firstMethod(FirstInterface firstInterface) {
        System.out.println(firstInterface.getClass().getSimpleName());
    }
    public void secondMethod(SecondInterface secondInterface) {
        System.out.println(secondInterface.getClass().getSimpleName());
    }
    public void thirdMethod(ThirdInterface thirdInterface) {
        System.out.println(thirdInterface.getClass().getSimpleName());
    }
    public void fourthMethod(FourthInterface fourthInterface) {
        System.out.println(fourthInterface.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        SecondClass s = new SecondClass();
        Exercise14 e = new Exercise14();
        e.firstMethod(s);
        e.secondMethod(s);
        e.thirdMethod(s);
        e.fourthMethod(s);
    }
}