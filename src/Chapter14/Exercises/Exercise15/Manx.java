package Chapter14.Exercises.Exercise15;

public class Manx extends Cat {
    public Manx(String name) {
        super(name);
    }
    public Manx() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<Manx> {
        public Manx create() {
            return new Manx();
        }
    }
}