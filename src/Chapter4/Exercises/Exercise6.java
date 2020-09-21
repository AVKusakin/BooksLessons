package Chapter4.Exercises;

import static net.mindview.util.Print.*;

/**
 * 6. Измените метод test() так, чтобы он получал два дополнительных аргумента begin и end, а значение testval
 * проверялось на принадлежность к диапазону [begin, end] (с включением границ).
 * @see Chapter4.Examples.IfElse2
 * date: 13.09.2020
 */
public class Exercise6 {
    static int test(int testval, int target, int begin, int end) {
        if(testval > target && testval >= begin && testval <= end)
            return +1;
        else if(testval < target)
            return -1;
        else
            return 0; // Одинаковые значения
    }
    public static void main(String[] args) {
        print(test(10,5, 0, 20));
        print(test(10,5, 15, 20));
        print(test(5,10, 0, 20));
        print(test(5,5, 0, 20));
    }
}