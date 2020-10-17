package Chapter8.Exercises;

/**
 * 17. Используя иерархию Cycle из упражнения 1, включите метод balance() в классы Unicycle и Bicycle, но не в Tricycle.
 * Создайте экземпляры всех трех типов и выполните их восходящее преобразование в массив Cycle. Попробуйте вызвать
 * balance() для каждого элемента массива. Теперь выполните нисходящее преобразование, вызовите balance() и
 * проанализируйте результат.
 * @see Chapter8.Exercises.Exercise1
 * date: 17.10.2020
 */
class Cycle3 {}

class Unicycle3 extends Cycle3 {
    public String toString() {
        return "Unicycle";
    }
    public void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle3 extends Cycle3 {
    public String toString() {
        return "Bicycle";
    }
    public void balance() {
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle3 extends Cycle3 {
    public String toString() {
        return "Tricycle";
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        Cycle3[] cycles = {new Unicycle3(), new Bicycle3(), new Tricycle3()};
        for (int i = 0; i < cycles.length; i++) {
            //! cycles[i].balance(); // Ошибка: cannot find symbol
        }
        ((Unicycle3)cycles[0]).balance();
        ((Bicycle3)cycles[1]).balance();
        //! ((Tricycle3)cycles[2]).balance(); // // Ошибка: cannot find symbol

    }
}
// Метод balance существует только в 2-х классах-наследниках класса Cycle, при этом в самом классе отсутствует.
// Поэтому при попытке вызова метода из объекта класса Cycle или Tricycle программа выведет ошибку.