package Chapter10.Examples;

//: innerclasses/LocalInnerClass.java
// Хранит последовательность объектов.
import static net.mindview.util.Print.*;

interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        // Локальный внутренний класс
        class LocalCounter implements Counter {
            public LocalCounter() {
                // У локального внутреннего класса
                // может быть собственный конструктор:
                print("LocalCounter()");
            }
            public int next() {
                printnb(name); // Неизменный аргумент
                return count++;
            }
        }
        return new LocalCounter();
    }
    // То же с анонимным внутренним классом:
    Counter getCounter2(final String name) {
        return new Counter() {
            // Анонимный внутренний класс не может содержать
            // именованного конструктора, только инициализатор экземпляра:
            {
                print("Counter()");
            }
            public int next() {
                printnb(name); // Неизменный аргумент
                return count++;
            }
        };
    }
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Локальный "),
                c2 = lic.getCounter2("Анонимный ");
        for (int i = 0; i < 5; i++)
            print(c1.next());
        for (int i = 0; i < 5; i++)
            print(c2.next());
    }
} /* Output:
LocalCounter()
Counter()
Локальный 0
Локальный 1
Локальный 2
Локальный 3
Локальный 4
Анонимный 5
Анонимный 6
Анонимный 7
Анонимный 8
Анонимный 9
*///:~