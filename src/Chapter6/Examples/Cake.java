package Chapter6.Examples;

//: access/Cake.java
// Обращение к классу из другого компилируемого модуля

public class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }
} /* Output:
Pie.f()
*///:~