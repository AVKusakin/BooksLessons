package Chapter10.Exercises.Exercise6.Package3;

import Chapter10.Exercises.Exercise6.Package1.Interface;
import Chapter10.Exercises.Exercise6.Package2.Class;

/**
 * 6. Создайте интерфейс, содержащий хотя бы один метод, в отдельном пакете. Создайте класс в другом пакете. Добавьте
 * защищенный внутренний класс, реализующий интерфейс. В третьем пакете создайте производный класс; внутри метода верните
 * объект защищенного внутреннего класса, преобразованный в интерфейс.
 * @see Chapter10.Exercises.Exercise6.Package1.Interface
 * @see Chapter10.Exercises.Exercise6.Package2.Class
 * date: 07.03.2021
 */
public class Exercise6 extends Class {
    public void getInnerClass() {
        Class c = Exercise6.this;
        Interface interf = c.getInterface();
        System.out.println(interf.getInterface());
    }

    public static void main(String[] args) {
        Exercise6 exercise = new Exercise6();
        exercise.getInnerClass();
    }
}