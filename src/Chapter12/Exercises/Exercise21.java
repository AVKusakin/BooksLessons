package Chapter12.Exercises;

/**
 * 21. Продемонстрируйте, что конструктор производного класса не может перехватывать исключения, возбужденные конструктором
 * базового класса.
 * date: 23.10.2022
 */
class Ancestor {
    public Ancestor() throws NullPointerException {
        throw new NullPointerException();
    }
}

class Descendant extends Ancestor {}

public class Exercise21 {
    public static void main(String[] args) {
        try {
            Ancestor ancestor = new Ancestor();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            Descendant descendant = new Descendant();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}