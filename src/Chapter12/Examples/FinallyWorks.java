package Chapter12.Examples;

//: exceptions/FinallyWorks.java
// Предложение finally выполняется всегда.

class ThreeException extends Exception {}

public class FinallyWorks {
    static int count = 0;
    public static void main(String[] args) {
        while (true) {
            try {
                // Постфиксный инкремент; при первом выполнении 0:
                if (count++ == 0)
                    throw new ThreeException();
                System.out.println("Нет исключения");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("В блоке finally");
                if (count == 2) break; // Выход из "while"
            }
        }
    }
} /* Output:
ThreeException
В блоке finally
Нет исключения
В блоке finally
*///:~