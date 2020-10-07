package Chapter7.Examples;

//: reusing/Chess.java
// Наследование, конструкторы и аргументы.
import static net.mindview.util.Print.*;

class Game {
    Game(int i) {
        print("конструктор Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("конструктор BoardGame");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("конструктор Chess");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
} /* Output:
конструктор Game
конструктор BoardGame
конструктор Chess
*///:~