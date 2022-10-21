package Chapter12.Examples;

//: exceptions/MultipleReturns.java
import static net.mindview.util.Print.*;

public class MultipleReturns {
    public static void f(int i) {
        print("Инициализация, требующая завершения");
        try {
            print("Точка 1");
            if (i == 1) return;
            print("Точка 2");
            if (i == 2) return;
            print("Точка 3");
            if (i == 3) return;
            print("Конец");
            return;
        } finally {
            print("Завершающие действия");
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
            f(i);
    }
} /* Output:
Инициализация, требующая завершения
Точка 1
Завершающие действия
Инициализация, требующая завершения
Точка 1
Точка 2
Завершающие действия
Инициализация, требующая завершения
Точка 1
Точка 2
Точка 3
Завершающие действия
Инициализация, требующая завершения
Точка 1
Точка 2
Точка 3
Конец
Завершающие действия
*///:~