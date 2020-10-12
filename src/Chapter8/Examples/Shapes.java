package Chapter8.Examples;

//: polymorphism/Shapes.java
import Chapter8.Examples.shape.*;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Заполняем массив фигурами:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Полиморфные вызовы методов:
        for (Shape shp : s)
            shp.draw();
    }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~