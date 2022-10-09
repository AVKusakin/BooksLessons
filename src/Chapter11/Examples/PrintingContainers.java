package Chapter11.Examples;

//: holding/PrintingContainers.java
// контейнеры распечатываются автоматически
import java.util.*;
import static net.mindview.util.Print.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("крыса");
        collection.add("кошка");
        collection.add("собака");
        collection.add("собака");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("крыса", "Анфиса");
        map.put("кошка", "Мурка");
        map.put("собака", "Шарик");
        map.put("собака", "Бобик");
        return map;
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new TreeSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new HashMap<String, String>()));
        print(fill(new TreeMap<String, String>()));
        print(fill(new LinkedHashMap<String, String>()));

    }
} /* Output:
[крыса, кошка, собака, собака]
[крыса, кошка, собака, собака]
[кошка, крыса, собака]
[кошка, крыса, собака]
[крыса, кошка, собака]
{кошка=Мурка, крыса=Анфиса, собака=Бобик}
{кошка=Мурка, крыса=Анфиса, собака=Бобик}
{крыса=Анфиса, кошка=Мурка, собака=Бобик}
*///:~