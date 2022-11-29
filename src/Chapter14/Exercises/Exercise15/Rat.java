package Chapter14.Exercises.Exercise15;

public class Rat extends Rodent {
    public Rat(String name) {
        super(name);
    }
    public Rat() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<Rat> {
        public Rat create() {
            return new Rat();
        }
    }
}