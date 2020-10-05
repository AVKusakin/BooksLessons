package Chapter7.Exercises;

/**
 * 1. Создайте простой класс. Во втором классе определите ссылку на объект первого класса. Используйте отложенную
 * инициализацию для создания экземпляров этого класса.
 * date: 05.10.2020
 */
class ForExercise1 {}

public class Exercise1 {
    public static void main(String[] args) {
        ForExercise1 forExercise1;
        System.out.println("Before initialization");
        forExercise1 = new ForExercise1();
    }
}