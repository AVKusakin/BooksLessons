package Chapter12.Examples;

//: exceptions/LoggingExceptions2.java
// Регистрация перехваченных исключений.
import java.util.logging.*;
import java.io.*;

public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
} /* Output:
окт. 18, 2022 7:42:22 AM Chapter12.Examples.LoggingExceptions2 logException
SEVERE: java.lang.NullPointerException
	at Chapter12.Examples.LoggingExceptions2.main(LoggingExceptions2.java:17)
*///:~