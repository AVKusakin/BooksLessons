package Chapter13.Exercises;

import java.util.*;

/**
 * 4. Измените пример Receipt.java так, чтобы все ширины управлялись одним набором констант. Сделайте так, чтобы ширину
 * вывода можно было изменить, модифицируя одно значение в одном месте.
 * @see Chapter13.Examples.Receipt
 * date: 02.11.2022
 */
public class Exercise4 {
    private double total = 0;
    private final Integer firstWidth = 15;
    private final Integer secondWidth = 5;
    private final Integer thirdWidth = 10;
    private Formatter f = new Formatter(System.out);
    public void printTitle() {
        f.format("%-" + firstWidth + "s %" + secondWidth + "s %" + thirdWidth + "s\n", "Item", "Qty", "Price");
        f.format("%-" + firstWidth + "s %" + secondWidth + "s %" + thirdWidth + "s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-" + firstWidth + ".15s %" + secondWidth + "d %" + thirdWidth + ".2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-" + firstWidth + "s %" + secondWidth + "s %" + thirdWidth + ".2f\n", "Tax", "", total * 0.06);
        f.format("%-" + firstWidth + "s %" + secondWidth + "s %" + thirdWidth + "s\n", "", "", "-----");
        f.format("%-" + firstWidth + "s %" + secondWidth + "s %" + thirdWidth + ".2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Exercise4 receipt = new Exercise4();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}