package Chapter11.Examples;

//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("src/Chapter11/Examples/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
} /* Output:
[A, B, C, Chapter11, Collections, D, E, Examples, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations,
String, X, Y, Z, add, addAll, added, args, class, contains, false, from, holding, import, in, java, main, mindview, net,
new, package, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~