package Chapter7.Exercises;

/**
 * 17. Измените упражнение 16 так, чтобы класс Frog переопределял методы базового класса (предоставляя новые определения
 * с той же сигнатурой метода). Посмотрите, что произойдет в методе main().
 * @see Chapter7.Exercises.Exercise16
 * date: 09.10.2020
 */
class Amphibian2 {
    void breathe() {
        System.out.println("Breathe");
    }
    void eat() {
        System.out.println("Eat");
    }
    void move() {
        System.out.println("Move");
    }
}

class Frog2 extends Amphibian2 {
    void breathe(int i) {
        System.out.println("Breathe " + i);
    }
    void eat(String s) {
        System.out.println("Eat " + s);
    }
    void move(boolean b) {
        System.out.println("Move " + b);
    }
    void jump() {
        System.out.println("Jump");
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        Frog2 frog = new Frog2();
        frog.jump();
        frog.breathe();
        frog.breathe(2);
        frog.eat();
        frog.eat("meat");
        frog.move();
        frog.move(true);
    }
}