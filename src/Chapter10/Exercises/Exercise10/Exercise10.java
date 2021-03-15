package Chapter10.Exercises.Exercise10;

/**
 * 10. Повторите предыдущее упражнение, но определите внутренний класс в области дейтсвия внутри метода.
 * @see Chapter10.Exercises.Exercise9
 * date: 15.03.2021
 */
public class Exercise10 {
    public Interface getInterface() {
        if (true) {
            class InnerClass implements Interface {
                @Override
                public String getString() {
                    return "String";
                }
            }
        }
        //   Будет выдана ошибка, так как класс InnerClass недоступен за пределами области действия, в которой он определяется
        //!  return new InnerClass();
        return null;
    }

    public static void main(String[] args) {
        Exercise10 e = new Exercise10();
        Interface i = e.getInterface();
//        System.out.println(i.getString());
    }
}