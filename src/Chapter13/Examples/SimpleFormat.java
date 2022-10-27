package Chapter13.Examples;

//: strings/SimpleFormat.java

public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        // Старый способ:
        System.out.println("Row1: [" + x + " " + y + "]");
        // Новый способ:
        System.out.format("Row1: [%d %f]\n", x, y);
        // или
        System.out.printf("Row1: [%d %f]\n", x, y);
    }
} /* Output:
Row1: [5 5.332542]
Row1: [5 5,332542]
Row1: [5 5,332542]
*///:~