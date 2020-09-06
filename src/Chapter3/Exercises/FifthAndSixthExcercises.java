package Chapter3.Exercises;

import static net.mindview.util.Print.*;

/**
 * 5. Создайте класс Dog, содержащий два поля String: name и says. В методе main() создайте два объекта Dog с разными
 * именами (spot и scruffy) и сообщениями. Выведите значения обоих полей для каждого из объектов.
 * 6. В упражнении 5 создайте новую ссылку на Dog и присвойте её объекту spot. Сравните ссылки оператором ==
 * и методом equals().
 * date: 06.09.2020
 */
class Dog {
    String name;
    String says;
}

public class FifthAndSixthExcercises {
    public static void main(String[] args) {
        // Упражнение 5.
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "Ah shit, here we go again.";
        scruffy.name = "scruffy";
        scruffy.says = "What you say about my mama?";
        print("The dog " + spot.name + " says : \"" + spot.says + "\".");
        print("The dog " + scruffy.name + " says : \"" + scruffy.says + "\".");

        // Упражнение 6.
        Dog teddy = new Dog();
        teddy.name = "teddy";
        teddy.says = "I need your clothes, your boots and your motorcycle.";
        spot = teddy;
        System.out.println(spot == teddy);
        System.out.println(spot.equals(teddy));
    }
}