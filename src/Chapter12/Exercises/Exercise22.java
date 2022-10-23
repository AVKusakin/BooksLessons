package Chapter12.Exercises;

/**
 * 22. Создайте класс FailingConstructor с конструктором, во время выполнения которого может произойти ошибка, приводящая
 * к выдаче исключения. В методе main() напишите код, который защищает программу от таких сбоев.
 * date: 23.10.2022
 */
class FailingConstructor {
    public FailingConstructor(String[] args) throws NullPointerException {
        if (args == null || (args != null && args.length == 0))
            throw new NullPointerException();
    }
}

public class Exercise22 {
    public static void main(String[] args) {
        try {
            FailingConstructor constructor = new FailingConstructor(args);
        } catch (NullPointerException e) {
            System.out.println("Program crash!");
            main(new String[]{"String1", "String2", "String3"});
        }

        System.out.println("The program is protected!");
    }
}