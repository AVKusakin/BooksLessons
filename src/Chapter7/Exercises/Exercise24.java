package Chapter7.Exercises;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * 24. В файле Beetle.java создайте ещё один тип, производный от Beetle, в таком же формате, как и у других классов.
 * Проследите за работой программы и объясните результат.
 * @see Chapter7.Examples.Beetle
 * date: 11.10.2020
 */
class Insect2 {
    private int i = 9;
    protected int j;
    Insect2() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("Поле static Insect2.x1 инициализировано");
    static int printInit(String s) {
        print(s);
        return new Random().nextInt(50);
    }
}

class Beetle2 extends Insect2 {
    private int k = printInit("Поле Beetle2.k инициализировано");
    public Beetle2() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 = printInit("Поле static Beetle2.x2 инициализировано");
    public static void main(String[] args) {
        print("Конструктор Beetle2");
        Beetle2 b = new Beetle2();
    }
}

public class Exercise24 extends Beetle2 {
    private int l = printInit("Поле Exercise24.l инициализировано");
    public Exercise24() {
        print("l = " + l);
        print("j = " + j);
    }
    private static int x3= printInit("Поле static Exercise24.x3 инициализировано");
    public static void main(String[] args) {
        Beetle2.main(args);
        print("Конструктор Exercise24");
        Exercise24 e = new Exercise24();
    }
}