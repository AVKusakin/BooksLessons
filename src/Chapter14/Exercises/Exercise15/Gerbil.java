package Chapter14.Exercises.Exercise15;

public class Gerbil extends Rodent {
    public Gerbil(String name) {
        super(name);
    }
    public Gerbil() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<Gerbil> {
        public Gerbil create() {
            return new Gerbil();
        }
    }
}