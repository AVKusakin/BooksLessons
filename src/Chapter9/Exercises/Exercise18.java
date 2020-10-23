package Chapter9.Exercises;

/**
 * 18. Создайте интерфейс Cycle с реализациями Unicycle, Bicycle и Tricycle. Создайте фабрику для каждой разновидности
 * Cycle и код, использующий эти фабрики.
 * date: 23.10.2020
 */
interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void ride() {
        System.out.println("I'm riding on unicycle.");
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    public void ride() {
        System.out.println("I'm riding on bicycle.");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    public void ride() {
        System.out.println("I'm riding on tricycle.");
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Exercise18 {
    public static void rideOnCycle(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }
    public static void main(String[] args) {
        rideOnCycle(new UnicycleFactory());
        rideOnCycle(new BicycleFactory());
        rideOnCycle(new TricycleFactory());
    }
}