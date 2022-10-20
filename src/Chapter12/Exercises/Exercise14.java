package Chapter12.Exercises;

import Chapter12.Examples.*;

/**
 * 14. Покажите, что программа OnOffSwitch.java может завершиться сбоем при возбуждении RuntimeException внутри блока try.
 * @see Chapter12.Examples.OnOffSwitch
 * date: 20.10.2022
 */
public class Exercise14 {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            f();
            throw new RuntimeException();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}