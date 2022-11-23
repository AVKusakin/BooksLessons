package Chapter14.Examples.pets;

//: typeinfo/pets/LiteralPetCreator.java
// Использование литералов class.
import java.util.*;

public class LiteralPetCreator extends PetCreator {
    // Блок try не нужен.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(Pet.class,
            Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class, EgyptianMau.class, Manx.class, Cymric.class,
            Rat.class, Mouse.class, Hamster.class));
    // Типы, которые должны создаваться случайным образом:
    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
    public List<Class<? extends Pet>> types() {
        return types;
    }
    public static void main(String[] args) {
        System.out.println(types);
    }
} /* Output:
[class Chapter14.Examples.pets.Mutt, class Chapter14.Examples.pets.Pug, class Chapter14.Examples.pets.EgyptianMau,
class Chapter14.Examples.pets.Manx, class Chapter14.Examples.pets.Cymric, class Chapter14.Examples.pets.Rat,
class Chapter14.Examples.pets.Mouse, class Chapter14.Examples.pets.Hamster]
*///:~