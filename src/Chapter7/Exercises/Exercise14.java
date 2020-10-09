package Chapter7.Exercises;

/**
 * 14. В Car.java добавьте в класс Engine метод service() и вызовите его из main().
 * @see Chapter7.Examples.Car
 * date: 09.10.2020
 */
class Engine2 {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service() {}
}

class Wheel2 {
    public void inflate(int psi) {}
}

class Window2 {
    public void rollup() {}
    public void rolldown() {}
}

class Door2 {
    public Window2 window = new Window2();
    public void open() {}
    public void close() {}
}

class Car2 {
    public Engine2 engine = new Engine2();
    public Wheel2[] wheels = new Wheel2[4];
    public Door2
            left = new Door2(),
            right = new Door2();
    public Car2() {
        for (int i = 0; i < 4; i++)
            wheels[i] = new Wheel2();
    }
}

public class Exercise14 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.engine.service();
    }
}