package Chapter14.Exercises.Exercise15;

public class Mutt extends Dog {
    public Mutt(String name) {
        super(name);
    }
    public Mutt() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<Mutt> {
        public Mutt create() {
            return new Mutt();
        }
    }
}