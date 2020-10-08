package Chapter7.Examples;

//: reusing/CADSystem.java
// Обеспечение необходимого завершения
import static net.mindview.util.Print.*;

class Shape {
    Shape(int i) {
        print("Конструктор Shape");
    }
    void dispose() {
        print("Завершение Shape");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        print("Рисуем окружность Circle");
    }
    void dispose() {
        print("Стираем окружность Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        print("Рисуем треугольник Triangle");
    }
    void dispose() {
        print("Стираем треугольник Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        print("Рисуем линию Line: " + start + ", " + end);
    }
    void dispose() {
        print("Стираем линию Line: " + start + ", " + end);
        super.dispose();
    }
}

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        print("Комбинированный конструктор");
    }
    void dispose() {
        print("CADSystem.dispose()");
        // Завершение осуществляется в порядке,
        // обратном порядку инициализации
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            // Код и обработка исключений...
        } finally {
            x.dispose();
        }
    }
} /* Output:
Конструктор Shape
Конструктор Shape
Рисуем линию Line: 0, 0
Конструктор Shape
Рисуем линию Line: 1, 1
Конструктор Shape
Рисуем линию Line: 2, 4
Конструктор Shape
Рисуем окружность Circle
Конструктор Shape
Рисуем треугольник Triangle
Комбинированный конструктор
CADSystem.dispose()
Стираем треугольник Triangle
Завершение Shape
Стираем окружность Circle
Завершение Shape
Стираем линию Line: 2, 4
Завершение Shape
Стираем линию Line: 1, 1
Завершение Shape
Стираем линию Line: 0, 0
Завершение Shape
Завершение Shape
*///:~