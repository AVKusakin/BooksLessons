package Chapter8.Exercises;

import static net.mindview.util.Print.*;

/**
 * 2. Добавьте аннотацию @Override в пример с фигурами.
 * @see Chapter8.Examples.shape
 * date: 12.10.2020
 */
class Shape2 {
    public void draw() {}
    public void erase() {}
}

class Circle2 extends Shape2 {
    @Override
    public void draw() {
        print("Circle2.draw()");
    }
    @Override
    public void erase() {
        print("Circle2.erase()");
    }
}

class Square2 extends Shape2 {
    @Override
    public void draw() {
        print("Square2.draw()");
    }
    @Override
    public void erase() {
        print("Square2.erase()");
    }
}

class Triangle2 extends Shape2 {
    @Override
    public void draw() {
        print("Triangle2.draw()");
    }
    @Override
    public void erase() {
        print("Triangle2.erase()");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2();
        Square2 square = new Square2();
        Triangle2 triangle = new Triangle2();
        circle.draw();
        square.draw();
        triangle.draw();
        circle.erase();
        square.erase();
        triangle.erase();
    }
}