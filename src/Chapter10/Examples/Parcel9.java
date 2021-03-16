package Chapter10.Examples;

//: innerclasses/Parcel9.java
// Анонимный внутренний класс, выполняющий инициализацию
// (сокращенная версия Parcel5.java).

public class Parcel9 {
    // Для использования в анонимном внутреннем классе
    // аргумент должен быть объявлен как final.
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Танзания");
    }
} ///:~