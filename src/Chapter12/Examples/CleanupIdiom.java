package Chapter12.Examples;

//: exceptions/CleanupIdiom.java
// За созданием каждого объекта, нуждающегося в завершении,
// должна следовать конструкция try-finally

class NeedsCleanup { // При конструировании ошибок быть не может
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " особожден");
    }
}

class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
    // Возможны ошибки при конструировании:
    public NeedsCleanup2() throws ConstructionException {}
}

public class CleanupIdiom {
    public static void main(String[] args) {
        // Часть 1:
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc1.dispose();
        }

        // Часть 2:
        // Если ошибки конструирования невозможны, объекты можно группировать:
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc3.dispose(); // Обратный порядок конструирования
            nc2.dispose();
        }
        // Часть 3:
        // Если при конструировании возможны ошибки,
        // необходимо защитить каждую операцию:
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) { // конструктор nc5
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) { // конструктор nc4
            System.out.println(e);
        }
    }
} /* Output:
NeedsCleanup 1 особожден
NeedsCleanup 3 особожден
NeedsCleanup 2 особожден
NeedsCleanup 5 особожден
NeedsCleanup 4 особожден
*///:~