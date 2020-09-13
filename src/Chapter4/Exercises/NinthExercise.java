package Chapter4.Exercises;

/**
 * 9. Числами Фибоначчи называется числовая последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34 и т.д., в которой каждое
 * число, начиная с третьего, является суммой двух предыдущих. Напишите метод, который получает целочисленный аргумент
 * и выводит указанное количество чисел Фибоначчи. Например, при запуске командой java Fibonacci 5 (где Fibonacci - имя
 * класса) должна выводиться последовательность 1, 1, 2, 3, 5.
 * date: 13.09.2020
 */
public class NinthExercise {
    static void getFibonacciNumbers(int x) {
        int fibonacciNumbers[] = new int[x];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < x; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        for (int number : fibonacciNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        getFibonacciNumbers(5);
        getFibonacciNumbers(9);
        getFibonacciNumbers(13);
    }
}