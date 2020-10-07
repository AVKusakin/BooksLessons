package Chapter7.Exercises;

import Chapter7.Examples.Detergent;
import static net.mindview.util.Print.*;

/**
 * 2. Объявите новый класс, производный от Detergent. Переопределите метод scrub() и добавьте новый метод с именем
 * sterilize().
 * @see Chapter7.Examples.Detergent
 * date: 07.10.2020
 */
public class Exercise2 extends Detergent {
    public void scrub() {
        append(" Exercise2.scrub()");
        super.scrub();
    }
    public void sterilize() {
        append(" sterilize()");
    }
    public static void main(String[] args) {
        Exercise2 x = new Exercise2();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        print(x);
    }
}