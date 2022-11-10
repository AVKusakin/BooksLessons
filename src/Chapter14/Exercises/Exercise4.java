package Chapter14.Exercises;

/**
 * 4. Измените предыдущий пример так, чтобы перед нисходящим преобразованием в нем использовался оператор instanceof для
 * проверки типа.
 * @see Chapter14.Exercises.Exercise3
 * date: 10.11.2022
 */
abstract class Shape2 {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle2 extends Shape2 {
    public String toString() {
        return "Circle";
    }
}

class Square2 extends Shape2 {
    public String toString() {
        return "Square";
    }
}

class Triangle2 extends Shape2 {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid2 extends Shape2 {
    public String toString() {
        return "Rhomboid";
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Rhomboid2 rhomboid = new Rhomboid2();
        Shape2 shape = rhomboid;

        if (shape instanceof Rhomboid2) {
            Rhomboid2 rhomboid1 = (Rhomboid2) shape;
        }

        if (shape instanceof Circle2) {
            Circle2 circle = (Circle2) shape;
        }

    }
}