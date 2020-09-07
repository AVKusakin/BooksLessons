package Chapter3.Examples;

//:operators/Literals.java
import static net.mindview.util.Print.*;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Шестнадцатиричное (нижний регистр)
        print("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // Шестнадцатиричное (верхний регистр)
        print("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // Восьмеричное (начинается с нуля)
        print("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // макс. шестнадцатиричное знач. char
        print("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // макс. шестнадцатиричное знач. byte
        print("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // макс. шестнадцатиричное знач. short
        print("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // Суффикс, обозначающий long
        long n2 = 200l; // Суффикс, обозначающий long (можно запутаться)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // Суффикс, обозначающий float
        float f3 = 1f; // Суффикс, обозначающий float
        double d1 = 1d; // Суффикс, обозначающий double
        double d2 = 1D; // Суффикс, обозначающий double
    }
} /* Output:
i1: 101111
i2: 101111
i3: 1111111
c: 1111111111111111
b: 1111111
s: 111111111111111
*///:~