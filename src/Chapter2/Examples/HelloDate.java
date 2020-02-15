package Chapter2.Examples;

//HelloDate.java
import java.util.*;

/** The first program-example of the book.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {
    /** Class and Application Entry Point
     * @param args Array of String Arguments
     * @throwsexceptions No exceptions are thrown
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
    }
}