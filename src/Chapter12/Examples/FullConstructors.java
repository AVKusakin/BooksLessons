package Chapter12.Examples;

//: exceptions/FullConstructors.java

class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) {super(msg);}
}

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Возбуждаем MyException из f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Возбуждаем MyException из g()");
        throw new MyException("Создано в g()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
} /* Output:
Возбуждаем MyException из f()
Chapter12.Examples.MyException
	at Chapter12.Examples.FullConstructors.f(FullConstructors.java:13)
	at Chapter12.Examples.FullConstructors.main(FullConstructors.java:21)
Возбуждаем MyException из g()
Chapter12.Examples.MyException: Создано в g()
	at Chapter12.Examples.FullConstructors.g(FullConstructors.java:17)
	at Chapter12.Examples.FullConstructors.main(FullConstructors.java:26)
*///:~