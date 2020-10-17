package Chapter8.Examples;

//: polymorphism/PolyConstructors.java
// Конструкторы и полиморфизм дают не тот
// результат, который можно было бы ожидать.
import static net.mindview.util.Print.*;

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

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
} /* Output:
Glyph перед вызовом draw()
RoundGlyph.draw(), radius = 0
Glyph после вызова draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~