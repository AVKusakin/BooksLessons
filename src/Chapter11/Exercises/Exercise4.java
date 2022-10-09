package Chapter11.Exercises;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * 4. Создайте класс-генератор, который при каждом вызове next() выдает имена персонажей вашего любимого фильма в виде
 * объектов String. Когда список заканчивается, программа снова возвращается к началу. Используйте генератор для заполнения
 * массива и контейнеров ArrayList, LinkedList, HashSet, LinkedHashSet и TreeSet, после чего выведите содержимое каждого
 * контейнера.
 * date: 09.10.2022
 */
class Generator {
    private List<String> characters = Arrays.asList("Harry Potter", "Hermione Granger", "Ronald Weasley", "Luna Lovegood",
            "Draco Malfoy", "Severus Snape", "Sirius Black", "Tom Riddle", "Albus Dumbledore", "Dolores Umbridge",
            "Ginny Weasley", "Remus Lupin", "Neville Longbottom", "Gellert Grindelwald", "Dobby", "Bellatrix Lestrange",
            "Peter Pettigrew", "Lavender Brown", "Gilderoy Lockhart", "Cedric Diggory", "Rubeus Hagrid", "George Weasley",
            "Fred Weasley", "James Potter", "Myrtle Warren", "Minerva McGonagall", "Viktor Krum", "Arthur Weasley",
            "Percy Weasley", "Argus Filch", "Sybill Trelawney", "Molly Weasley", "Horace Slughorn", "Nymphadora Tonks",
            "Dudley Dursley", "Cho Chang", "Lily Evans Potter", "Aberforth Dumbledore", "Bartemius Crouch Jr.",
            "Sorting Hat", "Garrick Ollivander", "Petunia Dursley", "Narcissa Malfoy", "Vernon Dursley",
            "Justin Finch-Fletchley", "Oliver Wood", "Quirinus Quirrell", "Rita Skeeter");

    private int i = 0;

    public String next() {
        String result = characters.get(i);
        i++;
        if (i == characters.size())
            i = 0;

        return result;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Generator generator = new Generator();

        String[] charactersArray = new String[50];
        List<String> charactersArrayList = new ArrayList();
        List<String> charactersLinkedList = new LinkedList();
        Set<String> charactersHashSet = new HashSet();
        Set<String> charactersLinkedHashSet = new LinkedHashSet();
        Set<String> charactersTreeSet = new TreeSet();

        for (int i = 0; i < 50; i++) {
            String character = generator.next();

            charactersArray[i] = character;
            charactersArrayList.add(character);
            charactersLinkedList.add(character);
            charactersHashSet.add(character);
            charactersLinkedHashSet.add(character);
            charactersTreeSet.add(character);
        }

        print("charactersArray: " + Arrays.toString(charactersArray));
        System.out.println();
        print("charactersArrayList: " + charactersArrayList);
        System.out.println();
        print("charactersLinkedList: " + charactersLinkedList);
        System.out.println();
        print("charactersHashSet: " + charactersHashSet);
        System.out.println();
        print("charactersLinkedHashSet: " + charactersLinkedHashSet);
        System.out.println();
        print("charactersTreeSet: " + charactersTreeSet);
    }
}