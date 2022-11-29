package Chapter14.Exercises.Exercise15;

public class Pug extends Dog {
    public Pug(String name) {
        super(name);
    }
    public Pug() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<Pug> {
        public Pug create() {
            return new Pug();
        }
    }
}