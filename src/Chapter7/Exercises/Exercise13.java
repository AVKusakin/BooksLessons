package Chapter7.Exercises;

/**
 * 13. Создайте класс с троекратно перегруженным методом. Объявите новый класс производным от него, добавьте новую
 * перегрузку метода и покажите, что все четыре метода доступны в производном классе.
 * date: 09.10.2020
 */
class ForExercise13 {
    void method(int i) {
        System.out.println("int " + i);
    }
    void method(String s) {
        System.out.println("String " + s);
    }
    void method(boolean b) {
        System.out.println("boolean " + b);
    }
}

public class Exercise13 extends ForExercise13 {
    void method(float f) {
        System.out.println("float " + f);
    }

    public static void main(String[] args) {
        Exercise13 x = new Exercise13();
        x.method(25);
        x.method("string");
        x.method(true);
        x.method(1.89f);

    }
}