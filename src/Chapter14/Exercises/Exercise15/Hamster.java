package Chapter14.Exercises.Exercise15;

public class Hamster extends Rodent {
    public Hamster(String name) {
        super(name);
    }
    public Hamster() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<Hamster> {
        public Hamster create() {
            return new Hamster();
        }
    }
}