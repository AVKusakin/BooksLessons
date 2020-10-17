package Chapter8.Exercises;

import static net.mindview.util.Print.*;

/**
 * 15. Включите класс RectangularGlyph в PolyConstructors.java. Продемонстрируйте проблему, описанную в соответствующем
 * разделе книги.
 * @see Chapter8.Examples.PolyConstructors
 * date: 17.10.2020
 */
class Glyph {
    void draw() {
        print("Glyph.draw()");
    }
    Glyph() {
        print("Glyph перед вызовом draw()");
        draw();
        print("Glyph после вызова draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private Integer obj;
    RectangularGlyph(Integer obj) {
        this.obj = obj;
        print("RectangularGlyph.RectangularGlyph(), obj = " + this.obj);
    }
    void draw() {
        print("RectangularGlyph.draw(), obj = " + this.obj.intValue());
    }
}

class PolyConstructors {
    public static void main(String[] args) {
        new RectangularGlyph(new Integer(5));
    }
}

public class Exercise15 {
    public static void main(String[] args) {
        //! PolyConstructors.main(args); // Ошибка: Exception in thread "main" java.lang.NullPointerException
    }
}