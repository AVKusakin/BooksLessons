package Chapter3.Exercises;

/**
 * 9. Выведите наибольшее и наименьшее число в экспоненциальной записи для типов float и double.
 * date: 07.09.2020
 */
public class Exercise9 {
    public static void main(String[] args) {
        float expMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Наибольшее число в экспоненциальной записи для типа float: " + expMaxFloatValue);
        System.out.println("Наименьшее число в экспоненциальной записи для типа float: " + -expMaxFloatValue);
        float expMinFloatValue = Float.MIN_VALUE;
        System.out.println("Наименьшее положительное число в экспоненциальной записи для типа float: " + expMinFloatValue);
        double expMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Наибольшее число в экспоненциальной записи для типа double: " + expMaxDoubleValue);
        System.out.println("Наименьшее число в экспоненциальной записи для типа double: " + -expMaxDoubleValue);
        double expMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Наименьшее положительное число в экспоненциальной записи для типа double: " + expMinDoubleValue);
    }
}