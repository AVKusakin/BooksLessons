package Chapter9.Exercises;

import Chapter8.Examples.music.Note;
import static net.mindview.util.Print.*;

/**
 * 10. Измените программу Music5.java, добавив в неё интерфейс Playable. Переместите объявление play из класса Instrument
 * в интерфейс Playable. Добавьте Playable к производным классам, включив его в список implements. Измените метод tune()
 * так, чтобы в аргументе ему передавался интерфейс Playable, а не класс Instrument.
 * @see Chapter9.Examples.music5.Music5
 * date: 18.10.2020
 */
interface Playable {
    void play(Note n);
}

interface Instrument2 {
    int VALUE = 5;
    void adjust();
}

class Wind2 implements Instrument2, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    public void adjust() {print(this + ".adjust()");}
}

class Percussion2 implements Instrument2, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Percussion";
    }
    public void adjust() {print(this + ".adjust()");}
}

class Stringed2 implements Instrument2, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() {
        return "Stringed";
    }
    public void adjust() {print(this + ".adjust()");}
}

class Brass2 extends Wind2 {
    public String toString() {
        return "Brass";
    }
}

class Woodwind2 extends Wind2 {
    public String toString() {
        return "Woodwind";
    }
}

public class Exercise10 {
    static void tune(Playable i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for (Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind2(),
                new Percussion2(),
                new Stringed2(),
                new Brass2(),
                new Woodwind2()
        };
        tuneAll(orchestra);
    }
}