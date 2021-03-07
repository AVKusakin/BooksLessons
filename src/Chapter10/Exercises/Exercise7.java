package Chapter10.Exercises;

/**
 * 7. Создайте класс, содержащий закрытое поле и закрытый метод. Создайте внутренний класс с методом, который изменяет поле
 * внешнего класса и вызывает метод внешнего класса. Во втором методе внешнего класса создайте объект внутреннего класса
 * и вызовите его метод; продемонстрируйте эффект на объекте внешнего класса.
 * date: 07.03.2021
 */
public class Exercise7 {
    private String field = "OldField";
    private String getString() {
        return "String";
    }

    class InnerClass {
        public String change(String newField) {
            field = newField;
            return "new field = " + newField + "; getString(): " + getString();
        }
    }

    public static void main(String[] args) {
        Exercise7 exercise = new Exercise7();
        Exercise7.InnerClass innerClass = exercise.new InnerClass();
        System.out.println("old field = " + exercise.field + "; getString(): " + exercise.getString());
        System.out.println(innerClass.change("NewField"));
    }
}