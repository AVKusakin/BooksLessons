package Chapter11.Exercises;

import net.mindview.util.*;

/**
 * 15. Стеки часто используются для вычисления выражений в языках программирования. Используя реализацию
 * net.mindview.util.Stack, вычислите результат следующего выражения, в котором «+» означает «занести следующую букву в
 * стек», а «-» - «извлечь верхний элемент стека и вывести его».
 * +U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---
 * date: 10.10.2022
 */
public class Exercise15 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String string = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        String[] stringArray = string.split("");

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("+"))
                stack.push(stringArray[i+1]);
            if (stringArray[i].equals("-"))
                System.out.print(stack.pop());
        }
    }
}