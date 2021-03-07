package Chapter10.Exercises;

/**
 * 8. Проверьте, доступны ли для внешнего класса закрытые элементы внутреннего класса.
 * date: 07.03.2021
 */
public class Exercise8 {
    class InnerClass{
        private String innerString = "innerString";
        private String getInnerField() {
            return "innerField";
        }
    }

    public static void getInnerElements() {
        Exercise8 exercise = new Exercise8();
        Exercise8.InnerClass innerClass = exercise.new InnerClass();
        System.out.println(innerClass.innerString);
        System.out.println(innerClass.getInnerField());
    }

    public static void main(String[] args) {
        getInnerElements();
    }
}
