package Chapter7.Examples;

//: reusing/Lisa.java
// {CompileTimeError} (Won't compile)

public class Lisa extends Homer {
    //! @Override
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
} ///:~