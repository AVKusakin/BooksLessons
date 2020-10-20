package Chapter9.Examples.interfaceprocessor;

//: interfaces/interfaceprocessor/Apply.java
import static net.mindview.util.Print.*;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using processor " + p.name());
        print(p.process(s));
    }
} ///:~