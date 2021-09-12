package Chapter10.Examples;

//: innerclasses/TestBed.java
// Размещение тестового кода во вложенном классе.
// {main: TestBed$Test}

public class TestBed {
    public void f() {
        System.out.println("f()");
    }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
} /* Output:
f()
*///:~