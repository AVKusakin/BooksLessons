package Chapter11.Examples;

//: holding/UniqueWordsAlphabetic.java
// Получение алфавитного списка слов.
import java.util.*;
import net.mindview.util.*;

public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("src/Chapter11/Examples/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
} /* Output:
[A, add, addAll, added, args, B, C, Chapter11, class, Collections, contains, D, E, Examples, F, false, from, G, H,
HashSet, holding, I, import, in, J, java, K, L, M, main, mindview, N, net, new, Output, package, Print, public, remove,
removeAll, removed, Set, set1, set2, SetOperations, split, static, String, to, true, util, void, X, Y, Z]
*///:~