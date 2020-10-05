package Chapter6.Exercises;

import Chapter6.Exercises.ForExercise8.*;

/**
 * 8. По образцу примера Lunch.java создайте класс с именем ConnectionManager, который управляет фиксированным массивом
 * объектов Connection. Программист-клиент не должен напрямую создавать объект Connection, а может получать их только с
 * помощью статического метода в классе ConnectionManager. Когда запас объектов у класса ConnectionManager будет исчерпан,
 * он должен вернуть ссылку null. Протестируйте классы в методе main().
 * @see Chapter6.Examples.Lunch
 * @see Chapter6.Exercises.ForExercise8.ConnectionManager
 * date: 05.10.2020
 */
public class Exercise8 {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println(ConnectionManager.getConnection(i));
        }
    }
}