package Chapter5.Exercises;

/**
 * 1. Создайте класс с неинициализированной ссылкой на String. Покажите, что Java инициализирует ссылку значением null.
 * date: 14.09.2020
 */
class ForFirstExercise {
    String str;

    public String getStr() {
        return str;
    }
}

public class FirstExercise {
    public static void main(String[] args) {
        ForFirstExercise forFirstExercise = new ForFirstExercise();
        System.out.println(forFirstExercise.getStr());
    }
}