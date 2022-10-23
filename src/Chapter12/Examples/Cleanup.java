package Chapter12.Examples;

//: exceptions/Cleanup.java
// Гарантированное освобождение ресурса

public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("src/Chapter12/Examples/Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ; // Обработка данных по строкам...
            } catch (Exception e) {
                System.out.println("Перехвачено исключение Exception в main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("Ошибка при конструировании InputFile");
        }
    }
} /* Output:
dispose() успешен
*///:~