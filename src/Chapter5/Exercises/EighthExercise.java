package Chapter5.Exercises;

/**
 * 8. Создайте класс c двумя методами. В первом методе дважды вызовите второй метод: один раз без ключевого слова this,
 * а второй с this - просто для того, чтобы убедиться в работоспособности этого синтаксиса; не используйте этот способ
 * вызова на практике.
 * date: 19.09.2020
 */
public class EighthExercise {
    public void firstMethod() {
        secondMethod();
        this.secondMethod();
    }
    public void secondMethod() {}
}