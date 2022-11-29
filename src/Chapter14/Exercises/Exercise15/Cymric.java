package Chapter14.Exercises.Exercise15;

public class Cymric extends Manx {
    public Cymric(String name) {
        super(name);
    }
    public Cymric() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<Cymric> {
        public Cymric create() {
            return new Cymric();
        }
    }
}