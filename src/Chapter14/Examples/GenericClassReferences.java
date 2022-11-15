package Chapter14.Examples;

//: typeinfo/GenericClassReferences.java

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // То же
        intClass = double.class;
        // genericIntClass = double.class; // Недопустимо
    }
} ///:~