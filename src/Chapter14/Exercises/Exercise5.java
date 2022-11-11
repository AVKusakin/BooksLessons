package Chapter14.Exercises;

import java.util.*;

/**
 * 5. Реализуйте в Shapes.java метод rotate(Shape), который проверяет, не относится ли фигура к классу Circle (и если 
 * относится - не выполняет ли операцию).
 * @see Chapter14.Examples.Shapes
 * date: 11.11.2022
 */
abstract class Shape3 {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle3 extends Shape3 {
    public String toString() {
        return "Circle";
    }
}

class Square3 extends Shape3 {
    public String toString() {
        return "Square";
    }
}

class Triangle3 extends Shape3 {
    public String toString() {
        return "Triangle";
    }
}

public class Exercise5 {
    public static void rotate(Shape3 shape) {
        if (!(shape instanceof Circle3))
            System.out.println("Rotate " + shape);
        else
            System.out.println("Can't rotate " + shape);
    }
    public static void main(String[] args) {
        List<Shape3> shapeList = Arrays.asList(new Circle3(), new Square3(), new Triangle3());
        for (Shape3 shape : shapeList) {
            rotate(shape);
        }
    }
}