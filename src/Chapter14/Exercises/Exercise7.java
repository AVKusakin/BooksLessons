package Chapter14.Exercises;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;

/**
 * 7. Измените пример SweetShop.java так, чтобы тип создаваемых объектов определялся аргументом командной строки. Другими 
 * словами, если для запуска используется командная строка java SweetShop Candy, то создаются только объекты Candy. 
 * Обратите внимание на возможность управления тем, какие объекты Class загружаются программой, через аргумент командной
 * строки.
 * @see Chapter14.Examples.SweetShop
 * date: 11.11.2022
 */
public class Exercise7 {
    private static Object getNewInstance(String className) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = Class.forName("Chapter14.Exercises." + className);
        return clazz.getDeclaredConstructor().newInstance();
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            InvocationTargetException, NoSuchMethodException {
        System.out.println(new String("в методе main".getBytes(), StandardCharsets.UTF_8));
        if (args != null && args.length > 0) {
            getNewInstance(args[0]);
            System.out.println(new String(("После создания объекта " + args[0]).getBytes(), StandardCharsets.UTF_8));
        }

        try {
            Class<?> gumClass = Class.forName("Chapter14.Exercises.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Не удалось найти Gum");
        }
        System.out.println(new String("После вызова метода Class.forName(\"Gum\")".getBytes(), StandardCharsets.UTF_8));
        if (args != null && args.length > 1) {
            getNewInstance(args[1]);
            System.out.println(new String(("После создания объекта " + args[1]).getBytes(), StandardCharsets.UTF_8));
        }
    }
}

class Candy {
    static { System.out.println(new String("Загрузка класса Candy".getBytes(), StandardCharsets.UTF_8)); }
}

class Gum {
    static { System.out.println(new String("Загрузка класса Gum".getBytes(), StandardCharsets.UTF_8)); }
}

class Cookie {
    static { System.out.println(new String("Загрузка класса Cookie".getBytes(), StandardCharsets.UTF_8)); }
}