package Chapter8.Exercises;

import Chapter8.Examples.music.Note;
import static net.mindview.util.Print.*;

/**
 * 6. Измените программу Music3.java так, чтобы метод what() стал методом корневого класса Object toString(). Попробуйте
 * вывести информацию об объектах Instrument вызовом System.out.println() (без использования преобразований).
 * @see Chapter8.Examples.music3.Music3
 * date: 13.10.2020
 */
class Instrument {
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

class Wind extends Instrument {
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

class Percussion extends Instrument {
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

class Stringed extends Instrument {
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

class Brass extends Wind {
    void play(Note n) {
        print("Brass.play() " + n);
    }
    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }
    public String toString() {
        return "Woodwind";
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Percussion percussion = new Percussion();
        Stringed stringed = new Stringed();
        Brass brass = new Brass();
        Woodwind woodwind = new Woodwind();
        System.out.println(wind + "; " + percussion + "; " + stringed + "; " + brass + "; " + woodwind);
    }
}