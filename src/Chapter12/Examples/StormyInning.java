package Chapter12.Examples;

//: exceptions/StormyInning.java
// Переопределенные методы могут возбуждать только
// исключения, описанные в версии базового класса,
// или исключения, производные от исключений
// базового класса.

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        // Фактически возбуждать исключение не нужно
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {} // Не возбуждает контролируемых исключений
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    // Можно добавлять новые исключения для
    // конструкторов, но вы должны обработать
    // и исключения базового конструктора:
    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}
    // Обычные методы должны соответствовать правилам базового класса:
    //! void walk() throws PopFoul {} // Ошибка компиляции
    // Интерфейс НЕ МОЖЕТ добавлять исключения
    // к существующим методам базового класса:
    //! public void event() throws RainedOut {}
    // Если метод не был определен в базовом
    // классе, исключение допускается:
    public void rainHard() throws RainedOut {}
    // Вы можете не возбуждать исключений вообще,
    // даже если базовая версия это делает:
    public void event() {}
    // Переопределенные методы могут возбуждать
    // унаследованные исключения:
    public void atBat() throws PopFoul {}
    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike не возбуждается в унаследованной версии
        try {
            // Что произойдет при восходящем преобразовании?
            Inning i = new StormyInning();
            i.atBat();
            // Вы должны перехватывать исключения
            // из базовой версии метода:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Общее исключение");
        }
    }
} ///:~