package Chapter2.Exercises;

/**
 * 11. Преобразуйте пример с классом AllTheColorsOfTheRainbow в работающую программу.
 * @see Chapter2.Examples.AllTheColorsOfTheRainbow
 * date: 15.02.2020
 */
public class Exercise11 {

    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        Exercise11 exercise11 = new Exercise11();
        System.out.println(exercise11.anIntegerRepresentingColors);
        exercise11.changeTheHueOfTheColor(3);
        System.out.println(exercise11.anIntegerRepresentingColors);
    }
}