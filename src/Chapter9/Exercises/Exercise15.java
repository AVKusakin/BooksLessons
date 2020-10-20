package Chapter9.Exercises;

/**
 * 15. Измените предыдущее упражнение - создайте абстрактный класс и унаследуйте производный класс от него.
 * @see Chapter9.Exercises.Exercise14
 * date: 20.10.2020
 */
interface FirstInterface2 {
    void fifm();
    void fism();
}

interface SecondInterface2 {
    void sifm();
    void sism();
}

interface ThirdInterface2 {
    void tifm();
    void tism();
}

interface FourthInterface2 extends FirstInterface2, SecondInterface2, ThirdInterface2 {
    void newMethod();
}

abstract class FirstClass2 {}

class SecondClass2 extends FirstClass2 implements FourthInterface2 {
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

public class Exercise15 {
    public void firstMethod(FirstInterface2 firstInterface) {
        System.out.println(firstInterface.getClass().getSimpleName());
    }
    public void secondMethod(SecondInterface2 secondInterface) {
        System.out.println(secondInterface.getClass().getSimpleName());
    }
    public void thirdMethod(ThirdInterface2 thirdInterface) {
        System.out.println(thirdInterface.getClass().getSimpleName());
    }
    public void fourthMethod(FourthInterface2 fourthInterface) {
        System.out.println(fourthInterface.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        SecondClass2 s = new SecondClass2();
        Exercise15 e = new Exercise15();
        e.firstMethod(s);
        e.secondMethod(s);
        e.thirdMethod(s);
        e.fourthMethod(s);
    }
}