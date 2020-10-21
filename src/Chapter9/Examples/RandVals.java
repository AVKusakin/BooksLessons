package Chapter9.Examples;

//: interfaces/RandVals.java
// Инициализация полей интерфейсов
// не-константными выражениями.
import java.util.*;

public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextFloat() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}