package Chapter8.Exercises;

import Chapter8.Examples.music.Note;
import static net.mindview.util.Print.*;

/**
 * 7. Добавьте новый подтип Instrument в программу Music3.java. Убедитесь в том, что полиморфизм работает правильно и
 * для этого нового типа.
 * @see Chapter8.Examples.music3.Music3
 * date: 13.10.2020
 */
class Instrument2 {
    void play(Note n) {
        print("Instrument.play() " + n);
    }
    public String toString() {
        return "Instrument";
    }
    void adjust() {
        print("Adjusting Instrument");
    }
}

class Wind2 extends Instrument2 {
    void play(Note n) {
        print("Wind.play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion2 extends Instrument2 {
    void play(Note n) {
        print("Percussion.play() " + n);
    }
    public String toString() {
        return "Percussion";
    }
    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed2 extends Instrument2 {
    void play(Note n) {
        print("Stringed.play() " + n);
    }
    public String toString() {
        return "Stringed";
    }
    void adjust() {
        print("Adjusting Stringed");
    }
}

class Brass2 extends Wind2 {
    void play(Note n) {
        print("Brass.play() " + n);
    }
    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind2 extends Wind2 {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }
    public String toString() {
        return "Woodwind";
    }
}

class Keyboard extends Instrument2 {
    void play(Note n) {
        print("Keyboard.play() " + n);
    }
    public String toString() {
        return "Keyboard";
    }
    void adjust() {
        print("Adjusting Keyboard");
    }
}

public class Exercise7 {
    public static void tune(Instrument2 i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        tune(new Keyboard());
    }
}