package Chapter14.Exercises;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * 14. Конструктор является разновидностью «Фабричного метода». Измените пример RegisteredFactories.java так, чтобы вместо
 * использования явно заданной фабрики объект класса сохранялся в List, а для создания каждого объекта использовался метод
 * newInstance().
 * @see Chapter14.Examples.RegisteredFactories
 * date: 29.11.2022
 */
class Part {
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Part> partFactories = new ArrayList<Part>();
    static {
        try {
            partFactories.add(FuelFilter.create());
            partFactories.add(AirFilter.create());
            partFactories.add(CabinAirFilter.create());
            partFactories.add(OilFilter.create());
            partFactories.add(FanBelt.create());
            partFactories.add(PowerSteeringBelt.create());
            partFactories.add(GeneratorBelt.create());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n);
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    public static FuelFilter create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return FuelFilter.class.getDeclaredConstructor().newInstance();
    }
}

class AirFilter extends Filter {
    public static AirFilter create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return AirFilter.class.getDeclaredConstructor().newInstance();
    }
}

class CabinAirFilter extends Filter {
    public static CabinAirFilter create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return CabinAirFilter.class.getDeclaredConstructor().newInstance();
    }
}

class OilFilter extends Filter {
    public static OilFilter create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return OilFilter.class.getDeclaredConstructor().newInstance();
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static FanBelt create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return FanBelt.class.getDeclaredConstructor().newInstance();
    }
}

class GeneratorBelt extends Belt {
    public static GeneratorBelt create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return GeneratorBelt.class.getDeclaredConstructor().newInstance();
    }
}

class PowerSteeringBelt extends Belt {
    public static PowerSteeringBelt create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return PowerSteeringBelt.class.getDeclaredConstructor().newInstance();
    }
}

public class Exercise14 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}