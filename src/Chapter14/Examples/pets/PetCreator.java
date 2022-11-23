package Chapter14.Examples.pets;

//: typeinfo/pets/PetCreator.java
// Creates random sequences of Pets.
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public abstract class PetCreator {
    private Random rand = new Random(47);
    // Контейнер List с разными видами создаваемых объектов Pet:
    public abstract List<Class<? extends Pet>> types();
    public Pet randomPet() { // Создание одного случайного объекта Pet
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
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
} ///:~