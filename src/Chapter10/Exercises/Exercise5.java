package Chapter10.Exercises;

/**
 * 5. Создайте класс с внутренним классом. В отдельном классе создайте экземпляр внутреннего класса.
 * date: 07.03.2021
 */
class OuterClass {
    class InnerClass {
        @Override
        public String toString() {
            return "InnerClass";
        }
    }

    @Override
    public String toString() {
        return "OuterClass";
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.toString() + "." + innerClass.toString());
    }
}