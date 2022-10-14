package Chapter11.Exercises;

import java.util.*;
import Chapter8.Examples.shape.*;

/**
 * 31. Измените пример polymorphism/shape/RandomShapeGenerator.java, чтобы он реализовал Iterable. Для этого необходимо
 * добавить конструктор, получающий количество элементов, которые должен создать итератор переод остановкой. Убедитесь в
 * том, что пример работает.
 * @see Chapter8.Examples.shape.RandomShapeGenerator
 * date: 14.10.2022
 */
class RandomShapeGenerator implements Iterable<Shape> {
    private int numberOfElements;
    private Random rand = new Random(47);

    public RandomShapeGenerator(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext() {
                return index < numberOfElements;
            }

            public Shape next() {
                index++;
                switch (rand.nextInt(3)) {
                    default:
                    case 0: return new Circle();
                    case 1: return new Square();
                    case 2: return new Triangle();
                }
            }
        };
    }
}

public class Exercise31 {
    public static void main(String[] args) {
        for (Shape shape : new RandomShapeGenerator(10)) {
            shape.draw();
            shape.erase();
            System.out.println();
        }
    }
}