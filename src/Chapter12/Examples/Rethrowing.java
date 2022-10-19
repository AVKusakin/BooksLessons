package Chapter12.Examples;

//: exceptions/Rethrowing.java
// Demostrating fillInStackTrace()

public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("Создание исключения в f()");
        throw new Exception("возбуждено из f()");
    }
    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("В методе g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }
    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("В методе h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
Создание исключения в f()
В методе g(), e.printStackTrace()
java.lang.Exception: возбуждено из f()
	at Chapter12.Examples.Rethrowing.f(Rethrowing.java:9)
	at Chapter12.Examples.Rethrowing.g(Rethrowing.java:13)
	at Chapter12.Examples.Rethrowing.main(Rethrowing.java:31)
main: printStackTrace()
java.lang.Exception: возбуждено из f()
	at Chapter12.Examples.Rethrowing.f(Rethrowing.java:9)
	at Chapter12.Examples.Rethrowing.g(Rethrowing.java:13)
	at Chapter12.Examples.Rethrowing.main(Rethrowing.java:31)
Создание исключения в f()
В методе h(), e.printStackTrace()
java.lang.Exception: возбуждено из f()
	at Chapter12.Examples.Rethrowing.f(Rethrowing.java:9)
	at Chapter12.Examples.Rethrowing.h(Rethrowing.java:22)
	at Chapter12.Examples.Rethrowing.main(Rethrowing.java:37)
main: printStackTrace()
java.lang.Exception: возбуждено из f()
	at Chapter12.Examples.Rethrowing.h(Rethrowing.java:26)
	at Chapter12.Examples.Rethrowing.main(Rethrowing.java:37)
*///:~