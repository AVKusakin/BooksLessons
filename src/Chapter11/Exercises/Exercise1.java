package Chapter11.Exercises;

import java.util.ArrayList;

/**
 * 1. Создайте новый класс с именем Gerbil с полем gerbilNumber типа int, инициализируемым в конструкторе. Определите в
 * нём метод hop(), который выводит значение gerbilNumber и короткое сообщение. Создайте контейнер ArrayList и добавьте
 * в него объекты Gerbil. Используйте метод get() для перебора элементов и вызова hop() для каждого объекта Gerbil.
 * date: 06.12.2021
 */
class Gerbil {
    private int gerbilNumber;
    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbil number equals " + gerbilNumber);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(17));
        gerbils.add(new Gerbil(33));
        gerbils.add(new Gerbil(265));

        for (int i = 0; i < gerbils.size(); i++)
            gerbils.get(i).hop();

        for (Gerbil gerbil : gerbils)
            gerbil.hop();
    }
}