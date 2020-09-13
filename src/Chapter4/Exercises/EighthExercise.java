package Chapter4.Exercises;

import static net.mindview.util.Print.*;

/**
 * 8. Создайте команду switch, которая выводит сообщение вкаждой секции case. Разместите её в цикле for, проверяющем
 * все допустимые значения case. Каждая секция case должна завершаться командой break. Затем удалите команды break и
 * посмотрите, что произойдет.
 * date: 13.09.2020
 */
public class EighthExercise {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                    print("case 1");
                    break;
                case 2:
                    print("case 2");
                    break;
                case 3:
                    print("case 3");
                    break;
                case 4:
                    print("case 4");
                    break;
                case 5:
                    print("case 5");
                    break;
                case 6:
                    print("case 6");
                    break;
                case 7:
                    print("case 7");
                    break;
                case 8:
                    print("case 8");
                    break;
                case 9:
                    print("case 9");
                    break;
                case 10:
                    print("case 10");
                    break;
            }
        }
    }
}
// При удалении всех команд break программа переходит к выполнению следующей секции case. Таким образом, если
// изначально программа возвращала следующее:
//  case 1
//  case 2
//  case 3
//  case 4
//  case 5
//  case 6
//  case 7
//  case 8
//  case 9
//  case 10,
// то при удалении программа возвращает:
//  case 1
//  case 2
//  case 3
//  case 4
//  case 5
//  case 6
//  case 7
//  case 8
//  case 9
//  case 10
//  case 2
//  case 3
//  case 4
//  case 5
//  case 6
//  case 7
//  case 8
//  case 9
//  case 10
//  case 3
//  case 4
//  case 5
//...