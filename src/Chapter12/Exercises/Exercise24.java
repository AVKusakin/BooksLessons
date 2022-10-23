package Chapter12.Exercises;

/**
 * 24. Добавьте в класс FailingConstructor метод dispose(). Напишите код для правильного использования этого класса.
 * @see Chapter12.Exercises.Exercise22
 * date: 23.10.2022
 */
class FailingConstructor3 {
    private String[] args;

    public FailingConstructor3(String[] args) throws NullPointerException {
        if (args == null || (args != null && args.length == 0))
            throw new NullPointerException();

        this.args = args;
    }

    public void dispose() {
        System.out.println("FailingConstructor с аргументами \"" + String.join(", ", args) + "\" особожден");
    }
}

public class Exercise24 {
    public static void main(String[] args) {
        try {
            FailingConstructor3 constructor = new FailingConstructor3(args);
            constructor.dispose();
        } catch (NullPointerException e) {
            System.out.println("Program crash!");
            main(new String[]{"String1", "String2", "String3"});
        }

        System.out.println("The program is protected!");
    }
}