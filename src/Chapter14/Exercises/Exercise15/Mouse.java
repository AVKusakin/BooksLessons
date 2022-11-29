package Chapter14.Exercises.Exercise15;

public class Mouse extends Rodent {
    public Mouse(String name) {
        super(name);
    }
    public Mouse() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<Mouse> {
        public Mouse create() {
            return new Mouse();
        }
    }
}