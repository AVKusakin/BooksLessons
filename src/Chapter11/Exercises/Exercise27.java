package Chapter11.Exercises;

import java.util.*;

/**
 * 27. Напишите класс с именем Command, который содержит поле String и метод operation(), выводящему String. Напишите
 * второй класс с методом, который заполняет контейнер Queue объектами Command и выводит его. Передайте заполненный
 * контейнер Queue методу третьего класса, перебирающему объекты Queue и вызывающему их методы operation().
 * date: 12.10.2022
 */
class Command {
    private String string;

    public Command(String string) {
        this.string = string;
    }

    public String operation() {
        return this.string;
    }
}

class SecondClass {
    public static Queue<Command> getQueue(Integer numberOfElements) {
        Queue<Command> queue = new LinkedList<Command>();

        for (int i = numberOfElements; i > 0; i--) {
            Command command = new Command(Integer.toString(i));
            queue.offer(command);
        }

        return queue;
    }
}

class ThirdClass {
    public static List<String> outputQueue(Queue<Command> queue) {
        List<String> strings = new ArrayList<>();
        while (queue.peek() != null)
            strings.add(queue.remove().operation());

        return strings;
    }
}

public class Exercise27 {
    public static void main(String[] args) {
        System.out.println(ThirdClass.outputQueue(SecondClass.getQueue(15)));
    }
}