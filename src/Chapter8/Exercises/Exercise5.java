package Chapter8.Exercises;

/**
 * 5. В упражнении 1 добавьте в класс Cycle метод wheels(), возвращающий количество колес каждого транспортного средства.
 * Измените метод ride() так, чтобы он вызывал wheels() и убедитесь в том, что полиморфизм успешно работает.
 * @see Chapter8.Exercises.Exercise1
 * date: 12.10.2020
 */
class Cycle2 {
    public int wheels() {
        return 0;
    }
}

class Unicycle2 extends Cycle2 {
    public String toString() {
        return "Unicycle";
    }
    public int wheels() {
        return 1;
    }
}

class Bicycle2 extends Cycle2 {
    public String toString() {
        return "Bicycle";
    }
    public int wheels() {
        return 2;
    }
}

class Tricycle2 extends Cycle2 {
    public String toString() {
        return "Tricycle";
    }
    public int wheels() {
        return 3;
    }
}

public class Exercise5 {
    public static void ride(Cycle2 c) {
        System.out.println("This is the " + c + ", and it has " + c.wheels() + " wheels.");
    }
    public static void main(String[] args) {
        Unicycle2 uni = new Unicycle2();
        Bicycle2 bi = new Bicycle2();
        Tricycle2 tri = new Tricycle2();
        ride(uni);
        ride(bi);
        ride(tri);
    }
}