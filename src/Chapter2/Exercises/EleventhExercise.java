package Chapter2.Exercises;

/**
 * 11. Преобразуйте пример с классом AllTheColorsOfTheRainbow в работающую программу.
 * @see Chapter2.Examples.AllTheColorsOfTheRainbow
 * date: 15.02.2020
 */
public class EleventhExercise {

    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        EleventhExercise eleventhExercise = new EleventhExercise();
        System.out.println(eleventhExercise.anIntegerRepresentingColors);
        eleventhExercise.changeTheHueOfTheColor(3);
        System.out.println(eleventhExercise.anIntegerRepresentingColors);
    }
}