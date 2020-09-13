package Chapter4.Examples;

//: control/LabeledWhile.java
// Цикл while с метками
import static net.mindview.util.Print.*;

public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            print("Внешний цикл while");
            while (true) {
                i++;
                print("i = " + i);
                if (i == 1) {
                    print("continue");
                    continue;
                }
                if (i == 3) {
                    print("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    print("break");
                    break;
                }
                if (i == 7) {
                    print("break outer");
                    break outer;
                }
            }
        }
    }
} /* Output:
Внешний цикл while
i = 1
continue
i = 2
i = 3
continue outer
Внешний цикл while
i = 4
i = 5
break
Внешний цикл while
i = 6
i = 7
break outer
*///:~