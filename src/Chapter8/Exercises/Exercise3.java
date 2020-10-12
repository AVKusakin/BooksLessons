package Chapter8.Exercises;

import static net.mindview.util.Print.*;

/**
 * 3. Включите в базовый класс Shape.java новый метод, выводящий сообщение, но не переопределяйте его в производных
 * классах. Объясните результат. Переопределите его в одном из производных классов и посмотрите, что происходит. Наконец,
 * переопределите метод во всех производных классах.
 * @see Chapter8.Examples.shape
 * date: 12.10.2020
 */
class Shape3 {
    public void draw() {}
    public void erase() {}
    public void printMessage() {
        print("This is the shape 3.");
    }
}

class Circle3 extends Shape3 {
    public void draw() {
        print("Circle3.draw()");
    }
    public void erase() {
        print("Circle3.erase()");
    }
}

class Square3 extends Shape3 {
    public void draw() {
        print("Square3.draw()");
    }
    public void erase() {
        print("Square3.erase()");
    }
}

class Triangle3 extends Shape3 {
    public void draw() {
        print("Triangle3.draw()");
    }
    public void erase() {
        print("Triangle3.erase()");
    }
}

class Shape4 {
    public void draw() {}
    public void erase() {}
    public void printMessage() {
        print("This is the shape 4.");
    }
}

class Circle4 extends Shape4 {
    public void draw() {
        print("Circle4.draw()");
    }
    public void erase() {
        print("Circle4.erase()");
    }
    public void printMessage() {
        print("This is the circle 4.");
    }
}

class Square4 extends Shape4 {
    public void draw() {
        print("Square4.draw()");
    }
    public void erase() {
        print("Square4.erase()");
    }
}

class Triangle4 extends Shape4 {
    public void draw() {
        print("Triangle4.draw()");
    }
    public void erase() {
        print("Triangle4.erase()");
    }
}

class Shape5 {
    public void draw() {}
    public void erase() {}
    public void printMessage() {
        print("This is the shape 5.");
    }
}

class Circle5 extends Shape5 {
    public void draw() {
        print("Circle5.draw()");
    }
    public void erase() {
        print("Circle5.erase()");
    }
    public void printMessage() {
        print("This is the circle 5.");
    }
}

class Square5 extends Shape5 {
    public void draw() {
        print("Square5.draw()");
    }
    public void erase() {
        print("Square5.erase()");
    }
    public void printMessage() {
        print("This is the square 5.");
    }
}

class Triangle5 extends Shape5 {
    public void draw() {
        print("Triangle5.draw()");
    }
    public void erase() {
        print("Triangle5.erase()");
    }
    public void printMessage() {
        print("This is the triangle 5.");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Circle3 c3 = new Circle3();
        Square3 s3 = new Square3();
        Triangle3 t3 = new Triangle3();
        c3.printMessage();
        s3.printMessage();
        t3.printMessage();
        // Так как метод printMessage() не переопределяется в классах-наследниках, то выполняется код метода
        // printMessage() базового класса. Таким образом, в данной ситуации в резльтате работы кода в консоль будет
        // выведено следующее:
        // This is the shape 3.
        // This is the shape 3.
        // This is the shape 3.
        System.out.println();
        Circle4 c4 = new Circle4();
        Square4 s4 = new Square4();
        Triangle4 t4 = new Triangle4();
        c4.printMessage();
        s4.printMessage();
        t4.printMessage();
        // Метод printMessage() переопределяется только в классе Circle. Значит, только в нём выводимое сообщение
        // изменится. Тогда в консоли отобразятся строки:
        // This is the circle 4.
        // This is the shape 4.
        // This is the shape 4.
        System.out.println();
        Circle5 c5 = new Circle5();
        Square5 s5 = new Square5();
        Triangle5 t5 = new Triangle5();
        c5.printMessage();
        s5.printMessage();
        t5.printMessage();
        // Метод printMessage() переопределяется в каждом классе наследнике. Результат будет следующим:
        // This is the circle 5.
        // This is the square 5.
        // This is the triangle 5.
    }
}