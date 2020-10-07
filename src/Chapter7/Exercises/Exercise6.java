package Chapter7.Exercises;

import static net.mindview.util.Print.print;

/**
 * 6. Используя пример Chess.java, докажите следующие утверждения из книги: "Если не вызвать конструктор базового класса
 * в BoardGame(), то компилятор «пожалуется» на то, что не может обнаружить конструктор в форме Game(). Вдобавок, вызов
 * конструктора базового класса должен быть первой командой в конструкторе производного класса. (Если вы вдруг забудете
 * об этом, компилятор тут же напомнит.)".
 * @see Chapter7.Examples.Chess
 * date: 07.10.2020
 */
class Game2 {
    Game2(int i) {
        print("конструктор Game2");
    }
}

class BoardGame2 extends Game2 {
    BoardGame2(int i) {
        super(i);
        print("конструктор BoardGame2");
    }
}

class Chess2 extends BoardGame2 {
    Chess2() {
        super(11);
        print("конструктор Chess2");
    }
    public static void main(String[] args) {
        Chess2 x = new Chess2();
    }
}

public class Exercise6 {
    // В обоих случаях выдаётся следующая ошибка:
    // java: constructor Game2 in class Chapter7.Exercises.Game2 cannot be applied to given types;
    //  required: int
    //  found: no arguments
    //  reason: actual and formal argument lists differ in length.
}