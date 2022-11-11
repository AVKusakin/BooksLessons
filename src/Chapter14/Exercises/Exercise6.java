package Chapter14.Exercises;

import java.util.*;

/**
 * 6. Измените пример Shapes.java так, чтобы он мог «выделять» (установкой внутреннего флага) все фигуры некоторого типа.
 * Метод toString() каждого класса, производного от Shape, должен указывать, находится ли данная фигура в «выделенном» 
 * состоянии.
 * @see Chapter14.Examples.Shapes
 * date: 11.11.2022
 */
abstract class Shape4 {
    public Boolean distinguished = Boolean.FALSE;
    abstract public String toString();
}

class Circle4 extends Shape4 {
    public String toString() {
        return "Circle is distinguished: " + this.distinguished;
    }
}

class Square4 extends Shape4 {
    public String toString() {
        return "Square is distinguished: " + this.distinguished;
    }
}

class Triangle4 extends Shape4 {
    public String toString() {
        return "Triangle is distinguished: " + this.distinguished;
    }
}

public class Exercise6 {
    private static void distinguish(List<Shape4> shapes, Class type) {
        for (Shape4 shape : shapes) {
            if (type.isInstance(shape))
                shape.distinguished = Boolean.TRUE;
            else
                shape.distinguished = Boolean.FALSE;
        }
    }
    private static void draw(List<Shape4> shapeList) {
        for (Shape4 shape : shapeList) {
            System.out.println(shape);
        }
    }
    public static void main(String[] args) {
        List<Shape4> shapeList = Arrays.asList(new Circle4(), new Square4(), new Triangle4(), new Circle4(), new Square4(),
                new Triangle4(), new Circle4(), new Square4(), new Triangle4());
        draw(shapeList);
        System.out.println("--------------------------------");
        System.out.println("Distinguish circles");
        System.out.println("--------------------------------");
        distinguish(shapeList, Circle4.class);
        draw(shapeList);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Distinguish squares");
        System.out.println("--------------------------------");
        distinguish(shapeList, Square4.class);
        draw(shapeList);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Distinguish triangles");
        System.out.println("--------------------------------");
        distinguish(shapeList, Triangle4.class);
        draw(shapeList);
        System.out.println();
    }
}