package Chapter5.Exercises;

/**
 * 12. Включите в класс с именем Tank (емкость), который можно наполнить или опустошить. Условие «готовности» требует,
 * чтобы он был пуст перед очисткой. Напишите метод finalize(), проверяющий это условие. В методе main() протестируйте
 * возможные случаи использования вашего класса.
 * date: 19.09.2020
 */
class Tank {
    boolean filled = false;
    String name = "";
    Tank(boolean filled, String name) {
        this.filled = filled;
        this.name = name;
    }
    void fillIn() {
        filled = true;
    }
    void toEmpty() {
        filled = false;
    }
    public void finalize() throws Throwable {
        if (!filled) {
            System.out.println(this.name + " is empty!");
            super.finalize();
        } else {
            System.out.println(this.name + " is full!");
        }
    }
}

public class TwelfthExercise {
    public static void main(String[] args) throws Throwable {
        Tank tank1 = new Tank(true, "tank1");
        tank1.finalize();
        tank1.toEmpty();
        tank1.finalize();

        Tank tank2 = new Tank(false, "tank2");
        tank2.fillIn();
        tank2.finalize();
        tank2.toEmpty();
        tank2.finalize();
    }
}