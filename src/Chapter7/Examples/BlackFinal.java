package Chapter7.Examples;

//: reusing/BlackFinal.java
// "Пустые" неизменные поля.

class Poppet {
    private int i;
    Poppet(int ii) {
        i = ii;
    }
}

public class BlackFinal {
    private final int i = 0; // Инициализированная константа
    private final int j;     // Пустая константа
    private final Poppet p;  // Пустая константа-ссылка
    // Пустые константы НЕОБХОДИМО инициализировать
    // в конструкторе:
    public BlackFinal() {
        j = 1; // Инициализация пустой константы
        p = new Poppet(1); // Инициализация пустой неизменной ссылки
    }
    public BlackFinal(int x) {
        j = x; // Инициализация пустой константы
        p = new Poppet(x); // Инициализация пустой неизменной ссылки
    }
    public static void main(String[] args) {
        new BlackFinal();
        new BlackFinal(47);
    }
} ///:~