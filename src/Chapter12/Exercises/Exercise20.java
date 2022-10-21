package Chapter12.Exercises;

/**
 * 20. Измените программу StormyInning.java, добавив туда исключение типа UmpireException и методы, возбуждающие это 
 * исключение. Протестируйте получившуюся иерархию.
 * @see Chapter12.Examples.StormyInning
 * date: 21.10.2022
 */
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireException extends Exception {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Strike, Foul, UmpireException;
    public void walk() throws UmpireException {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class Exercise20 extends Inning implements Storm {
    public Exercise20() throws RainedOut, BaseballException {}
    public Exercise20(String s) throws Foul, BaseballException {}
    public void rainHard() throws RainedOut {}
    public void event() {}
    public void atBat() throws PopFoul {}
    public static void main(String[] args) {
        try {
            Exercise20 si = new Exercise20();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            Inning i = new Exercise20();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Общее исключение");
        } catch (UmpireException e) {
            System.out.println("Umpire");
        }
    }
}