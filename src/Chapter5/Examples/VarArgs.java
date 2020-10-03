package Chapter5.Examples;

//: initialization/VarArgs.java
// Использование синтаксиса массивов
// для получения переменного списка параметров.

class A { int i; }

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"раз", "два", "три"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
} /* Output:
47 3.14 11.11
раз два три
A@17327b6 A@14ae5a5 A@131245a
*///:~