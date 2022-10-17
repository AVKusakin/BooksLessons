package Chapter12.Examples;

//: exceptions/LoggingExceptions.java
// Вывод информации об исключении через объект Logger.
import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Перехвачено " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Перехвачено " + e);
        }
    }
} /* Output:
окт. 17, 2022 8:17:20 PM Chapter12.Examples.LoggingException <init>
SEVERE: Chapter12.Examples.LoggingException
	at Chapter12.Examples.LoggingExceptions.main(LoggingExceptions.java:20)

Перехвачено Chapter12.Examples.LoggingException
окт. 17, 2022 8:17:20 PM Chapter12.Examples.LoggingException <init>
SEVERE: Chapter12.Examples.LoggingException
	at Chapter12.Examples.LoggingExceptions.main(LoggingExceptions.java:25)

Перехвачено Chapter12.Examples.LoggingException
*///:~