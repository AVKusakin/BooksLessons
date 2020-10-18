package Chapter9.Examples.music5;

//: interfaces/music4/Music5.java
// Интерфейсы.
import Chapter8.Examples.music.Note;
import static net.mindview.util.Print.*;

interface Instrument {
    // Константа времени компиляции
    int VALUE = 5; // является и static, и final
    // Определения методов недопустимы:
    void play(Note n); // Автоматически объявлен как public
    void adjust();
}

class Wind implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    public void adjust() {print(this + ".adjust()");}
}

class Percussion implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Percussion";
    }
    public void adjust() {print(this + ".adjust()");}
}

class Stringed implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Stringed";
    }
    public void adjust() {print(this + ".adjust()");}
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    // Работа метода не зависит от фактического типа объекта,
    // поэтому типы, добавленные в систему, будут работать правильно:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Восходящее преобразование при добавлении в массив:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
