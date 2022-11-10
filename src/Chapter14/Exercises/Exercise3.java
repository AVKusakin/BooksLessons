package Chapter14.Exercises;

/**
 * 3. Добавьте класс Rhomboid в иерархию Shapes.java. Создайте объект Rhomboid, выполните восходящее преобразование его в
 * Shape, а затем снова верните его к классу Rhomboid нисходящим преобразованием. Попробуйте выполнить нисходящее
 * преобразование к Circle и объясните, что при этом происходит.
 * @see Chapter14.Examples.Shapes
 * date: 10.11.2022
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();
        Shape shape = rhomboid;
        Rhomboid rhomboid1 = (Rhomboid) shape;
        // При преобразованиях объектов меняется только тип ссылки, которая ссылается на объект в памяти. Сам объект
        // всегда остается того же типа, что и при создании. Таким образом, объект rhomboid не является экземпляром
        // класса Circle, будет выведено исключение ClassCastException.
        // Circle circle = (Circle) shape;
    }
}