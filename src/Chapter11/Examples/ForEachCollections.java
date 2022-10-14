package Chapter11.Examples;

//: holding/ForEachCollections.java
// Все коллекции работают с foreach.
import java.util.*;

public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "Один два три четыре пять".split(" "));
        for (String s : cs)
            System.out.print("'" + s + "' ");
    }
} /* Output:
'Один' 'два' 'три' 'четыре' 'пять'
*///:~