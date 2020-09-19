package Chapter5.Examples;

//: initialization/MethodInit3.java
public class MethodInit3 {
    //! int j = g(i); // Недопустимая опережающая ссылка
    int i = f();
    int f() { return 11; }
    int g(int n) { return n * 10; }
} ///:~