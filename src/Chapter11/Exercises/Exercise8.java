package Chapter11.Exercises;

import java.util.*;

/**
 * 8. Измените упражнение 1 так, чтобы для перемещения по контейнеру List при вызовах hop() использовался итератор Iterator.
 * @see Chapter11.Exercises.Exercise1
 * date: 09.10.2022
 */
class Gerbil1 {
    private int gerbilNumber;
    public Gerbil1(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbil number equals " + gerbilNumber);
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<Gerbil1> gerbils = new ArrayList<Gerbil1>();
        gerbils.add(new Gerbil1(1));
        gerbils.add(new Gerbil1(17));
        gerbils.add(new Gerbil1(33));
        gerbils.add(new Gerbil1(265));

        Iterator<Gerbil1> it = gerbils.iterator();
        while (it.hasNext()) {
            Gerbil1 gerbil = it.next();
            gerbil.hop();
        }
    }
}