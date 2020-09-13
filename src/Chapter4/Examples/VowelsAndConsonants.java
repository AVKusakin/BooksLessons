package Chapter4.Examples;

//: control/VowelsAndConsonants.java
// Демонстрация конструкции switch.
import java.util.*;
import static net.mindview.util.Print.*;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char)c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': print("гласная");
                  break;
                case 'y':
                case 'w': print("Условно гласная");
                  break;
                default: print("согласная");
            }
        }
    }
}