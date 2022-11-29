package Chapter14.Exercises.Exercise15;

import java.util.*;

public class Pet {
    private String name;

    public Pet() {}

    public Pet(String name) {
        this.name = name;
    }

    static List<Factory<? extends Pet>> petFactories = new ArrayList<Factory<? extends Pet>>();
    static {
        petFactories.add(new Mutt.Factory());
        petFactories.add(new Pug.Factory());
        petFactories.add(new EgyptianMau.Factory());
        petFactories.add(new Manx.Factory());
        petFactories.add(new Cymric.Factory());
        petFactories.add(new Rat.Factory());
        petFactories.add(new Mouse.Factory());
        petFactories.add(new Hamster.Factory());
        petFactories.add(new Gerbil.Factory());
    }
}