package Chapter14.Exercises.Exercise15;

public class EgyptianMau extends Cat {
    public EgyptianMau(String name) {
        super(name);
    }
    public EgyptianMau() {
        super();
    }
    public static class Factory implements Chapter14.Exercises.Exercise15.Factory<EgyptianMau> {
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }
}