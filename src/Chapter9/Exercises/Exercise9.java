package Chapter9.Exercises;

import Chapter8.Examples.music.Note;
import static net.mindview.util.Print.*;

/**
 * 9. Переделайте программу Music5.java, переместив общие методы Wind, Percussion и Stringed в абстрактный класс.
 * @see Chapter9.Examples.music5.Music5
 * date: 18.10.2020
 */
interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

abstract class MusicInstrument {
    public void play(Note n) {}
    public void adjust() {}
}

class Wind extends MusicInstrument implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    public void adjust() {print(this + ".adjust()");}
}

class Percussion extends MusicInstrument implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Percussion";
    }
    public void adjust() {print(this + ".adjust()");}
}

class Stringed extends MusicInstrument implements Instrument {
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

public class Exercise9 {
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}