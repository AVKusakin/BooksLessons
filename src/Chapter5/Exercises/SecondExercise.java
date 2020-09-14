package Chapter5.Exercises;

/**
 * 2. Создайте класс с полем String, инициализируемым в точке определения, и другим полем, инициализируемым
 * конструктором. Чем отличаются эти два подхода?
 * date: 14.09.2020
 */
class ForSecondExercise {
    static String str1 = new String("1");
    static String str2;

    ForSecondExercise() {
        str2 = new String("2");
    }

    public static String getStr1() {
        return str1;
    }
    public static String getStr2() {
        return str2;
    }
}

public class SecondExercise {
    public static void main(String[] args) {
        System.out.println(ForSecondExercise.getStr1());
        System.out.println(ForSecondExercise.getStr2());
        System.out.println();
        ForSecondExercise forSecondExercise = new ForSecondExercise();
        System.out.println(forSecondExercise.getStr1());
        System.out.println(forSecondExercise.getStr2());
    }
}
// Подходы отличаются тем, что память под объект str1 выделяется до создания объекта ForSecondExercise, в отличие от
// str2. Объект str2 создаётся только при явном создании объекта ForSecondExercise. Это демонстрируют резльтаты работы
// программы:
// 1
// null
//
// 1
// 2