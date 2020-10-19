package Chapter9.Examples.classprocessor;

//: interfaces/classprocessor/Apply.java
import java.util.*;
import static net.mindview.util.Print.*;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    String process(Object input) { // Ковариантный возвращаемый тип
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        // Аргумент split() используется для разбиения строки
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        print("Используем Processor " + p.name());
        print(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
} /* Output:
Используем Processor Upcase
DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
Используем Processor Downcase
disagreement with beliefs is by definition incorrect
Используем Processor Splitter
[Disagreement, with, beliefs, is, by, definition, incorrect]
*///:~