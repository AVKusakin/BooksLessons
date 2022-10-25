package Chapter12.Exercises;

/**
 * 25. Создайте трёхуровневую иерархию исключений. Далее сделайте базовый класс A с методом, который возбуждает исключение,
 * являющееся основой иерархии. Унаследуйте класс B от A и переопределите метод так, чтобы он возбуждал исключение из
 * второго уровня иерархии. Аналогично поступите при наследовании класса C от B. В методе main() создайте класс C, проведите
 * восходящее преобразование к классу A, а затем вызовите метод.
 * date: 25.10.2022
 */
class SeniorException extends Exception {}
class MiddleException extends SeniorException {}
class JuniorException extends MiddleException {}

class A {
    public void throwException() throws SeniorException {
        throw new SeniorException();
    }
}

class B extends A {
    public void throwException() throws MiddleException {
        throw new MiddleException();
    }
}

class C extends B {
    public void throwException() throws JuniorException {
        throw new JuniorException();
    }
}

public class Exercise25 {
    public static void main(String[] args) {
        C c = new C();
        try {
            c.throwException();
        } catch (SeniorException se) {
            System.out.println("catch SeniorException");
        }

        try {
            ((A)c).throwException();
        } catch (SeniorException se) {
            System.out.println("catch SeniorException");
        }
    }
}