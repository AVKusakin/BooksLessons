package Chapter10.Exercises;

/**
 * 26. Создайте класс с внутренним классом, имеющим конструктор с аргументами (не являющийся конструктором по умолчанию).
 * Создайте второй класс с внутренним классом, наследующим от первого внутреннего класса.
 * date: 05.12.2021
 */
class FirstOuterClass {
    class FirstInnerClass {
        private String string;
        private Integer number;
        public FirstInnerClass(String string, Integer number) {
            this.string = string;
            this.number = number;
            System.out.println(this.string + this.number);
        }
    }
}

class SecondOuterClass {
    class SecondInnerClass extends FirstOuterClass.FirstInnerClass {
        public SecondInnerClass(FirstOuterClass foc) {
            foc.super("Это второй класс - ", 2);
        }
    }
}

public class Exercise26 {
    public static void main(String[] args) {
        FirstOuterClass foc = new FirstOuterClass();
        SecondOuterClass soc = new SecondOuterClass();
        SecondOuterClass.SecondInnerClass sic = soc.new SecondInnerClass(foc);
    }
}