package Chapter12.Examples;

//: exceptions/RethrowNew.java
// Повторное возбуждение объекта исключения, отличного от перехваченного.

class OneException extends Exception {
    public OneException(String s) {super(s);}
}

class TwoException extends Exception {
    public TwoException(String s) {super(s);}
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("Создание исключения в f()");
        throw new OneException("из f()");
    }
    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Перехвачено во внутреннем блоке try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("из внутреннего блока try");
            }
        } catch (TwoException e) {
            System.out.println("Перехвачено во внешнем блоке try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
Создание исключения в f()
Перехвачено во внутреннем блоке try, e.printStackTrace()
Chapter12.Examples.OneException: из f()
	at Chapter12.Examples.RethrowNew.f(RethrowNew.java:17)
	at Chapter12.Examples.RethrowNew.main(RethrowNew.java:22)
Перехвачено во внешнем блоке try, e.printStackTrace()
Chapter12.Examples.TwoException: из внутреннего блока try
	at Chapter12.Examples.RethrowNew.main(RethrowNew.java:26)
*///:~