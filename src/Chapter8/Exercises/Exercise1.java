package Chapter8.Exercises;

/**
 * 1. Создайте класс Cycle с производными классами Unicycle, Bicycle и Tricycle. Покажите, что экземпляр каждого из
 * производных типов может быть преобразован в Cycle, на примере вызова метода ride().
 * date: 12.10.2020
 */
class Cycle {}

class Unicycle extends Cycle {
    public String toString() {
        return "Unicycle";
    }
}

class Bicycle extends Cycle {
    public String toString() {
        return "Bicycle";
    }
}

class Tricycle extends Cycle {
    public String toString() {
        return "Tricycle";
    }
}

public class Exercise1 {
    public static void ride(Cycle c) {
        System.out.println(c + ".ride()");
    }
    public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();
        ride(uni);
        ride(bi);
        ride(tri);
    }
}