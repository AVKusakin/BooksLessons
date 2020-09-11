package Chapter3.Examples;

//: operators/Overflow.java
// Сюрприз! В Java возможно переполнение.

public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("большое = " + big);
        int bigger = big * 4;
        System.out.println("ещё больше = " + bigger);
    }
} /* Output:
большое = 2147483647
ещё больше = -4
*///:~