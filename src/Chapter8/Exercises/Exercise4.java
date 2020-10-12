package Chapter8.Exercises;

import static net.mindview.util.Print.*;

/**
 * 4. Добавьте новый подтип Shape к программе Shape.java и проверьте на методе main(), что полиморфизм работает правильно
 * для вашего нового типа, так же как и для старых типов.
 * @see Chapter8.Examples.shape
 * date: 12.10.2020
 */
class Shape6 {
    public void draw() {}
    public void erase() {}
}

class Circle6 extends Shape6 {
    public void draw() {
        print("Circle6.draw()");
    }
    public void erase() {
        print("Circle6.erase()");
    }
}

class Square6 extends Shape6 {
    public void draw() {
        print("Square6.draw()");
    }
    public void erase() {
        print("Square6.erase()");
    }
}

class Triangle6 extends Shape6 {
    public void draw() {
        print("Triangle6.draw()");
    }
    public void erase() {
        print("Triangle6.erase()");
    }
}

class Line6 extends Shape6 {
    public void draw() {
        print("Line6.draw()");
    }
    public void erase() {
        print("Line6.erase()");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Circle6 circle = new Circle6();
        Square6 square = new Square6();
        Triangle6 triangle = new Triangle6();
        Line6 line = new Line6();
        circle.draw();
        square.draw();
        triangle.draw();
        line.draw();
        circle.erase();
        square.erase();
        triangle.erase();
        line.erase();
    }
}