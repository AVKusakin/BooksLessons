package Chapter8.Exercises;

/**
 * 10. Создайте базовый классс двумя методами. В первом методе вызовите второй метод. Определите производный класс и
 * переопределите второй метод. Создайте объект производного класса, выполните восходящее преобразование к базовому типу
 * и вызовите первый метод. Объясните результат.
 * date: 13.10.2020
 */
class ForExercise10 {
    public void firstMethod() {
        this.secondMethod();
    }
    public void secondMethod() {
        System.out.println("ForExercise10.secondMethod()");
    }
}

public class Exercise10 extends ForExercise10 {
    public void secondMethod() {
        System.out.println("Exercise10.secondMethod()");
    }
    public static void main(String[] args) {
        ForExercise10 e = new Exercise10();
        e.firstMethod();
    }
}
// Был вызван второй метод, переопределенный в производном классе, потому что даже при восходящем преобразовании при
// работе с объектом будут выполняться методы класса-наследника. Так как первый метод не переопределён, то в Exercise10
// он остаётся неизменным и выполняет тот же код, что и базовый класс. В данном случае вызывается метод текущего класса
// (Exercise10), то есть переопределенный второй метод.