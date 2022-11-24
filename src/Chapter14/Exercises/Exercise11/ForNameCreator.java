package Chapter14.Exercises.Exercise11;

import Chapter14.Examples.pets.*;
import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "Chapter14.Examples.pets.Mutt",
            "Chapter14.Examples.pets.Pug",
            "Chapter14.Examples.pets.EgyptianMau",
            "Chapter14.Examples.pets.Manx",
            "Chapter14.Examples.pets.Cymric",
            "Chapter14.Examples.pets.Rat",
            "Chapter14.Examples.pets.Mouse",
            "Chapter14.Examples.pets.Hamster",
            "Chapter14.Examples.pets.Gerbil"
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add((Class<? extends Pet>)Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static {loader();}
    public List<Class<? extends Pet>> types() {
        return types;
    }
} ///:~
