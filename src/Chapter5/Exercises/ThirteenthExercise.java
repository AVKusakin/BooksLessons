package Chapter5.Exercises;

import static net.mindview.util.Print.*;

/**
 * 13. Проверьте истинность следующих утверждений:
 * "Статические инициализаторы класса Cups выполняются либо при обращении к статическому объекту c1 в строке с пометкой
 * (1), либо если строка (1) закомментирована - в строках (2) после снятия комментариев. Если же строка (1) и строки (2)
 * закомментированы, static-инициализация класса Cups никогда не выполнится. Также неважно, будет ли выполнена одна или
 * обе строки (2) программы - static-инициализация все равно выполняется только один раз."
 * @see Chapter5.Examples.ExplicitStatic
 * date: 20.09.2020
 */
class ForTheFirstStatement {
    ForTheFirstStatement(int marker) {
        print("ForTheFirstStatement(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}

class ForTheFirstStatements {
    static ForTheFirstStatement forTheFirstStatement1;
    static ForTheFirstStatement forTheFirstStatement2;
    static {
        forTheFirstStatement1 = new ForTheFirstStatement(1);
        forTheFirstStatement2 = new ForTheFirstStatement(2);
    }
    ForTheFirstStatements() {
        print("ForTheFirstStatements()");
    }
}

class ForTheSecondStatement {
    ForTheSecondStatement(int marker) {
        print("ForTheSecondStatement(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}

class ForTheSecondStatements {
    static ForTheSecondStatement forTheSecondStatement1;
    static ForTheSecondStatement forTheSecondStatement2;
    static {
        forTheSecondStatement1 = new ForTheSecondStatement(1);
        forTheSecondStatement2 = new ForTheSecondStatement(2);
    }
    ForTheSecondStatements() {
        print("ForTheSecondStatements()");
    }
}

class ForTheThirdStatement {
    ForTheThirdStatement(int marker) {
        print("ForTheThirdStatement(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}

class ForTheThirdStatements {
    static ForTheThirdStatement forTheThirdStatement1;
    static ForTheThirdStatement forTheThirdStatement2;
    static {
        forTheThirdStatement1 = new ForTheThirdStatement(1);
        forTheThirdStatement2 = new ForTheThirdStatement(2);
    }
    ForTheThirdStatements() {
        print("ForTheThirdStatements()");
    }
}

public class ThirteenthExercise {
    public static void main(String[] args) {
        print("Inside main()");
//        ForTheFirstStatements.forTheFirstStatement1.f(99); // (1)
//        ForTheSecondStatements.forTheSecondStatement1.f(99); // (1)
//        ForTheThirdStatements.forTheThirdStatement1.f(99); // (1)

    }
    static ForTheFirstStatements forTheFirstStatements1 = new ForTheFirstStatements(); // (2)
//    static ForTheFirstStatements forTheFirstStatements2 = new ForTheFirstStatements(); // (2)
    static ForTheSecondStatements forTheSecondStatements1 = new ForTheSecondStatements(); // (2)
    static ForTheSecondStatements forTheSecondStatements2 = new ForTheSecondStatements(); // (2)
//    static ForTheThirdStatements forTheThirdStatements1 = new ForTheThirdStatements(); // (2)
//    static ForTheThirdStatements forTheThirdStatements2 = new ForTheThirdStatements(); // (2)
}