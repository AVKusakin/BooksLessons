package Chapter5.Examples;

//: initialization/ArrayNew.java
// Создание массивов оператором new.
import java.util.*;
import static net.mindview.util.Print.*;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        print("Длина a = " + a.length);
        print(Arrays.toString(a));
    }
}