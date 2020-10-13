package Chapter8.Exercises;

import Chapter8.Examples.music.Note;
import java.util.*;
import static net.mindview.util.Print.*;

/**
 * 8. Измените программу Music3.java, чтобы в ней случайным образом генерировались объекты Instrument, как в программе
 * Shape.java.
 * @see Chapter8.Examples.music3.Music3
 * @see Chapter8.Examples.Shapes
 * date: 13.10.2020
 */
class Instrument3 {
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

class Wind3 extends Instrument3 {
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

class Percussion3 extends Instrument3 {
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

class Stringed3 extends Instrument3 {
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

class Brass3 extends Wind3 {
    void play(Note n) {
        print("Brass.play() " + n);
    }
    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind3 extends Wind3 {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }
    public String toString() {
        return "Woodwind";
    }
}

class Keyboard3 extends Instrument3 {
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

class RandomInstrumentGenerator {
    private Random rand = new Random(47);
    public Instrument3 next() {
        switch (rand.nextInt(6)) {
            default:
            case 0: return new Wind3();
            case 1: return new Percussion3();
            case 2: return new Stringed3();
            case 3: return new Brass3();
            case 4: return new Woodwind3();
            case 5: return new Keyboard3();
        }
    }
}

public class Exercise8 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    public static void main(String[] args) {
        Instrument3[] instruments = new Instrument3[15];
        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = gen.next();
        }

        for (Instrument3 instrument : instruments) {
            instrument.play(Note.C_SHARP);
        }
    }
}