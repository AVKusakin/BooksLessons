package Chapter13.Exercises;

import java.io.*;
import java.util.*;

/**
 * 3. Измените пример Turtle.java так, чтобы весь вывод направлялся в поток System.err.
 * @see Chapter13.Examples.Turtle
 * date: 27.10.2022
 */
public class Exercise3 {
    private String name;
    private Formatter f;
    public Exercise3(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s the Turtle is at (%d,%d)\n", name, x, y);
    }
    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        Exercise3 tommy = new Exercise3("Tommy", new Formatter(System.err));
        Exercise3 terry = new Exercise3("Terry", new Formatter(System.err));
        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);
    }
}
