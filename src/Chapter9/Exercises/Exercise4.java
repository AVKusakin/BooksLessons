package Chapter9.Exercises;

/**
 * 4. Создайте абстрактный (abstract) класс без методов. Произведите от него класс и добавьте метод. Создайте статический
 * (static) метод, получающий ссылку на базовый класс, проведите нисходящее преобразование к производному типу и вызовите
 * его метод. Продемонстрируйте, что такой способ работает, в метод main(). Теперь поместите в определение метода из
 * базового класса ключевое слово abstract, и необходимость в нисходящем преобразовании исчезнет.
 * date: 18.10.2020
 */
abstract class ForExercise4AbstractClass {}

class ForExercise4DerivativeClass extends ForExercise4AbstractClass {
    public void showName() {
        System.out.println("ForExercise4DerivativeClass");
    }
}

abstract class ForExercise4AbstractClass2 {
    abstract public void showName();
}

class ForExercise4DerivativeClass2 extends ForExercise4AbstractClass2 {
    public void showName() {
        System.out.println("ForExercise4DerivativeClass2");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        ForExercise4AbstractClass f = new ForExercise4DerivativeClass();
        //! f.showName(); // Ошибка: cannot find symbol
        ((ForExercise4DerivativeClass)f).showName();

        ForExercise4AbstractClass2 f2 = new ForExercise4DerivativeClass2();
        f2.showName();
    }
}