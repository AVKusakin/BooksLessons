package Chapter11.Exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 17. Возьмите класс Gerbil из упражнения 1 и поместите его в контейнер Map. Используйте объект String, содержащий имя
 * каждого объекта Gerbil, в качестве ключа для связывания с объектом Gerbil (значение), помещаемым в таблицу. Получите
 * Iterator для keySet() и используйте его для перемещения по Map, с выборкой объекта Gerbil для каждого ключа, выводом
 * ключа и вызовом метода hop().
 * @see Chapter11.Exercises.Exercise1
 * date: 10.10.2022
 */
class Gerbil2 {
    private int gerbilNumber;
    public Gerbil2(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbil number equals " + gerbilNumber);
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        Gerbil2 firstGerbil = new Gerbil2(1);
        Gerbil2 secondGerbil = new Gerbil2(17);
        Gerbil2 thirdGerbil = new Gerbil2(33);
        Gerbil2 fourthGerbil = new Gerbil2(265);

        Map<String, Gerbil2> gerbils = new HashMap<String, Gerbil2>();
        gerbils.put(firstGerbil.toString(), firstGerbil);
        gerbils.put(secondGerbil.toString(), secondGerbil);
        gerbils.put(thirdGerbil.toString(), thirdGerbil);
        gerbils.put(fourthGerbil.toString(), fourthGerbil);

        Set<String> keySet = gerbils.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("key: " + key);
            gerbils.get(key).hop();
        }
    }
}