package Chapter7.Exercises;

/**
 * 16. Создайте класс с именем Amphibian. Объявите производный от него класс с именем Frog. Разместите в базовом классе
 * несколько методов. В методе main() создайте объект Frog, преобразуйте его в Amphibian и продемонстрируйте, что все
 * методы работают.
 * date: 09.10.2020
 */
class Amphibian {
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

class Frog extends Amphibian {
    void jump() {
        System.out.println("Jump");
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.jump();
        frog.breathe();
        frog.eat();
        frog.move();
    }
}