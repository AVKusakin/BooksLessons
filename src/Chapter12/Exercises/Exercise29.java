package Chapter12.Exercises;

/**
 * 29. Измените все типы исключений в StormyInning.java так, чтобы они расширяли RuntimeException. Покажите, что при этом
 * не обязательны ни спецификации исключений, ни блоки try. Удалите комментарии //! и продемонстрируйте, что эти методы
 * могут компилироваться без спецификаций.
 * @see Chapter12.Examples.StormyInning
 * date: 25.10.2022
 */
class BaseballException2 extends RuntimeException {}
class Foul2 extends BaseballException2 {}
class Strike2 extends BaseballException2 {}

abstract class Inning2 {
    public Inning2() {}
    public void event() {}
    public abstract void atBat();
    public void walk() {}
}

class StormException2 extends RuntimeException {}
class RainedOut2 extends StormException2 {}
class PopFoul2 extends Foul2 {}

interface Storm2 {
    public void event();
    public void rainHard();
}

public class Exercise29 extends Inning2 implements Storm2 {
    public Exercise29() {}
    public Exercise29(String s) {}
    public void walk() {}
    public void event() {}
    public void rainHard() {}
    public void atBat() {
        throw new PopFoul2();
    }
    public static void main(String[] args) {
        Exercise29 si = new Exercise29();
        si.atBat();

        Inning2 i = new Exercise29();
        i.atBat();
    }
}