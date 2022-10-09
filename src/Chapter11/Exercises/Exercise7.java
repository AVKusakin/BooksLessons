package Chapter11.Exercises;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * 7. Создайте класс, затем создайте инициализированный массив объектов этого класса. Заполните контейнер List данными
 * массива. Создайте подмножество List методом subList(), после чего удалите это подмножество из вашего контейнера List.
 * date: 09.10.2022
 */
class ForExercise7 {
    private int number;

    public ForExercise7(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(this.number);
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        ForExercise7[] array = new ForExercise7[10];
        for (int i = 0; i < 10; i++)
            array[i] = new ForExercise7(i);

        List<ForExercise7> list = new ArrayList<>();
        for (ForExercise7 object : array)
            list.add(object);

        List<ForExercise7> subList = list.subList(1, 5);
        print(list);
        list.removeAll(subList);
        print(list);
    }
}