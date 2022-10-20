package Chapter12.Examples;

//: exceptions/WithFinally.java
// Finally гарантирует выполнение завершающего кода.

public class WithFinally {
    static Switch sw = new Switch();
    public static void main(String[] args) {
        try {
            sw.on();
            // Код, который может возбуждать исключения...
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
} /* Output:
вкл
выкл
*///:~