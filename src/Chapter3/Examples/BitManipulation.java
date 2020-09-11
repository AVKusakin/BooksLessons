package Chapter3.Examples;

//: operators/BitManipulation.java
// Использование поразрядных операторов.
import java.util.*;
import static net.mindview.util.Print.*;

public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("макс. положит.", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("макс. отрицат.", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", -1L);
        long ll = 9223372036854775807L;
        printBinaryLong("макс. положит.", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("макс. отрицат.", lln);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);
    }
    static void printBinaryInt(String s, int i){
        print(s + ", int: " + i + ", двочиное: \n   " + Integer.toBinaryString(i));
    }
    static void printBinaryLong(String s, long l){
        print(s + ", long: " + l + ", двочиное: \n   " + Long.toBinaryString(l));
    }
}