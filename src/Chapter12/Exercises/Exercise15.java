package Chapter12.Exercises;

import Chapter12.Examples.*;

/**
 * 15. Продемонстрируйте, что программа WithFinally.java работает корректно при возбуждении RuntimeException внутри блока try.
 * @see Chapter12.Examples.WithFinally
 * date: 20.10.2022
 */
public class Exercise15 {
    static Switch sw = new Switch();
    public static void main(String[] args) {
        try {
            sw.on();
            OnOffSwitch.f();
            throw new RuntimeException();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}