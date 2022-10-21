package Chapter12.Exercises;

import static net.mindview.util.Print.*;

/**
 * 16. Измените пример reusing/CADSystem.java и покажите, что при возврате управления из середины try-finally все равно
 * выполняются необходимые завершающие действия.
 * @see Chapter7.Examples.CADSystem
 * date: 21.10.2022
 */
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

public class Exercise16 extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public Exercise16(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        print("Комбинированный конструктор");
    }
    void dispose() {
        print("Exercise16.dispose()");
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Exercise16 x = new Exercise16(47);
        try {
            return;
        } finally {
            x.dispose();
        }
    }
}