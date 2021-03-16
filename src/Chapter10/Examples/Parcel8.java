package Chapter10.Examples;

//: innerclasses/Parcel8.java
// Вызов конструктора базового класса.

public class Parcel8 {
    public Wrapping wrapping(int x) {
        // Вызов конструктора базового класса:
        return new Wrapping(x) { // Передача аргумента конструктору
            public int value() {
                return super.value() * 47;
            }
        }; // Точка с запятой необходима
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
} ///:~