package Chapter12.Exercises;

/**
 * 2. Определите ссылку на объект и присвойте ей значение null. Попробуйте вызвать метод объекта, пользуясь этой ссылкой.
 * Потом вставьте этот код в блок try-catch и перехватите исключение.
 * date: 17.10.2022
 */
public class Exercise2 {
    public static void main(String[] args) {
        try {
            Object object = null;
            object.toString();
        } catch (NullPointerException e) {
            System.out.println("Перехваченное исключение!");
        }
    }
}