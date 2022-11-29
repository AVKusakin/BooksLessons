package Chapter14.Exercises.Exercise15;

import java.util.*;

public class PetCreator {
    private Random rand = new Random(47);
    public static final List<Class<? extends Pet>> allTypes = List.of(Pet.class, Dog.class, Cat.class, Rodent.class,
            Mutt.class, Pug.class, EgyptianMau.class, Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class);
    public Pet randomPet() {
        int n = rand.nextInt(Pet.petFactories.size());
        return Pet.petFactories.get(n).create();
    }
    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }
    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}