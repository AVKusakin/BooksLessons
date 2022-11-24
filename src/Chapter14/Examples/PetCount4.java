package Chapter14.Examples;

//: typeinfo/PetCount4.java
import Chapter14.Examples.pets.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
} /* Output: (Sample)
Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric
{Mouse=2, Mutt=3, Pug=3, Dog=6, Rodent=5, Cat=9, Cymric=5, Hamster=1, Manx=7, EgyptianMau=2, Rat=2, Pet=20}
*///:~