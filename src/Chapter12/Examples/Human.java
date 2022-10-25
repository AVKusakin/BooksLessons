package Chapter12.Examples;

//: exceptions/Human.java
// Перехват иерархий исключений.

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Human {
    public static void main(String[] args) {
        // Перехват точного типа
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Перехвачено Sneeze");
        } catch (Annoyance a) {
            System.out.println("Перехвачено Annoyance");
        }
        // Перехват базового типа:
        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Перехвачено Annoyance");
        }
    }
} /* Output:
Перехвачено Sneeze
Перехвачено Annoyance
*///:~