package Chapter12.Examples;

//: exceptions/ExtraFeatures.java
// Расширение функциональности классов исключений.
import static net.mindview.util.Print.*;

class MyException2 extends Exception {
    private int x;
    public MyException2() {}
    public MyException2(String msg) {super(msg);}
    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }
    public int val() {return x;}
    public String getMessage() {
        return "Подробное сообщение: " + x + " " + super.getMessage();
    }
}

public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из f()");
        throw new MyException2();
    }
    public static void g() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из g()");
        throw new MyException2("Создано в g()");
    }
    public static void h() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из h()");
        throw new MyException2("Создано в h()", 47);
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }
} /* Output:
Возбуждаем MyException2 из f()
Chapter12.Examples.MyException2: Подробное сообщение: 0 null
	at Chapter12.Examples.ExtraFeatures.f(ExtraFeatures.java:24)
	at Chapter12.Examples.ExtraFeatures.main(ExtraFeatures.java:36)
Возбуждаем MyException2 из g()
Chapter12.Examples.MyException2: Подробное сообщение: 0 Создано в g()
	at Chapter12.Examples.ExtraFeatures.g(ExtraFeatures.java:28)
	at Chapter12.Examples.ExtraFeatures.main(ExtraFeatures.java:41)
Возбуждаем MyException2 из h()
Chapter12.Examples.MyException2: Подробное сообщение: 47 Создано в h()
	at Chapter12.Examples.ExtraFeatures.h(ExtraFeatures.java:32)
	at Chapter12.Examples.ExtraFeatures.main(ExtraFeatures.java:46)
e.val() = 47
*///:~