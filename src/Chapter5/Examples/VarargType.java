package Chapter5.Examples;

//: initialization/VarargType.java

public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" длина " + args.length);
    }
    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" длина " + args.length);
    }
    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
} /* Output:
class [Ljava.lang.Character; длина 1
class [Ljava.lang.Character; длина 0
class [I длина 1
class [I длина 0
int[]: class [I
*///:~