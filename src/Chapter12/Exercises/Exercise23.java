package Chapter12.Exercises;

/**
 * 23. Добавьте в предыдущее упражнение класс с методом dispose(). Измените класс FailingConstructor так, чтобы конструктор
 * создавал один из таких объектов в поле класса; далее конструктор может выдать исключение, после чего создает второй
 * объект с необходимостью вызова dispose(). Напишите код для защиты от ошибок; в методе main() убедитесь в том, что защита
 * распространяется на все возможные ситуации с ошибками.
 * @see Chapter12.Exercises.Exercise22
 * date: 23.10.2022
 */
class NewClass {
    public void dispose() {
        System.out.println("dispose() успешен.");
    }
}

class FailingConstructor2 {
    private NewClass nc;

    public FailingConstructor2(String[] args, NewClass nc) throws NullPointerException {
        this.nc = nc;

        if (args == null || (args != null && args.length == 0))
            throw new NullPointerException();

        NewClass nc2 = new NewClass();
        nc2.dispose();
    }
}

public class Exercise23 {
    public static void main(String[] args) {
        try {
            FailingConstructor2 constructor = new FailingConstructor2(args.length == 0 ? null : args, new NewClass());
        } catch (NullPointerException e) {
            System.out.println("Program crash!");
            try {
                FailingConstructor2 constructor = new FailingConstructor2(args, new NewClass());
            } catch (NullPointerException e2) {
                main(new String[]{"String1", "String2", "String3"});
            }
        }

        System.out.println("The program is protected!");
    }
}