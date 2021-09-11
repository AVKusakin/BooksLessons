package Chapter10.Exercises.Exercise12;

/**
 * 12. Повторите упражнение 7 с анонимным внутренним классом.
 * @see Chapter10.Exercises.Exercise7
 * date: 11.09.2021
 */
public class Exercise12 {
    private String field = "OldField";
    private String getString() {
        return "String";
    }
    public InnerClass getInnerClass() {
        return new InnerClass() {
            public String change(String newField) {
                field = newField;
                return "new field = " + newField + "; getString(): " + getString();
            }
        };
    }

    public static void main(String[] args) {
        Exercise12 exercise = new Exercise12();
        InnerClass innerClass = exercise.getInnerClass();
        System.out.println("old field = " + exercise.field + "; getString(): " + exercise.getString());
        System.out.println(innerClass.change("NewField"));
    }
}