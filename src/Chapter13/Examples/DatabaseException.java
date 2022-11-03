package Chapter13.Examples;

//: strings/DatabaseException.java

public class DatabaseException extends Exception {
    public DatabaseException(int transactionID, int queryID, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }
    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Ошибка записи");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} /* Output:
Chapter13.Examples.DatabaseException: (t3, q7) Ошибка записи
*///:~