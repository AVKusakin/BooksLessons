package Chapter7.Exercises;

/**
 * 8. Создайте базовый класс с единственным конструктором, не являющимся конструктором по умолчанию, и производный класс
 * с конструктором как по умолчанию (без аргументов), так и с аргументами. В конструкторе производного класса вызовите
 * конструктор базового класса.
 * date: 07.10.2020
 */
class BaseClass {
    public BaseClass(String s, Float f) {
        System.out.println("BaseClass constructor");
    }
}

class DerivativeClass extends BaseClass {
    //! public DerivativeClass() { // There is no default constructor available in 'Chapter7.Exercises.BaseClass'
    //!    System.out.println("DerivativeClass default constructor");
    //! }
    public DerivativeClass(String s, Float f) {
        super(s, f);
        System.out.println("DerivativeClass constructor");
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        DerivativeClass derivativeClass = new DerivativeClass("s", 0.0f);
    }
}