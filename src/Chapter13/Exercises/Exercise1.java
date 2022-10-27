package Chapter13.Exercises;

/**
 * 1. Проанализируйте метод SprinklerSystem.toString() из примера reusing/SprinklerSystem.java и определите, избавит ли
 * написание метода toString() с явным созданием StringBuilder от лишних операций создания StringBuilder.
 * @see Chapter7.Examples.SprinklerSystem
 * date: 27.10.2022
 */
class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "сконструирован";
    }
    public String toString() {
        return s;
    }
}

public class Exercise1 {
    private String valve1, valve2, valve3, valve4;
    private String valve;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            result.append("valve" + i + " = " + valve + " ");
        }
        result.append("\n");
        result.append("i = " + i);
        result.append(" " + "f = " + f);
        result.append(" " + "source = " + source);
        return result.toString();
    }
    public static void main(String[] args) {
        Exercise1 sprinklers = new Exercise1();
        System.out.println(sprinklers);
    }
}