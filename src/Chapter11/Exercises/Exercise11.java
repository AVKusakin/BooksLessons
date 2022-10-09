package Chapter11.Exercises;

import java.util.*;

/**
 * 11. Напишите метод, который использует Iterator для перебора Collection и выводит результат вызова toString() для
 * каждого объекта в контейнере. Заполните объектами разные типы Collection и примените свой метод к каждому контейнеру.
 * date: 09.10.2022
 */
public class Exercise11 {
    public static List<String> characters = Arrays.asList("Harry Potter", "Hermione Granger", "Ronald Weasley", "Luna Lovegood",
            "Draco Malfoy", "Severus Snape", "Sirius Black", "Tom Riddle", "Albus Dumbledore", "Dolores Umbridge",
            "Ginny Weasley", "Remus Lupin", "Neville Longbottom", "Gellert Grindelwald", "Dobby", "Bellatrix Lestrange",
            "Peter Pettigrew", "Lavender Brown", "Gilderoy Lockhart", "Cedric Diggory", "Rubeus Hagrid", "George Weasley",
            "Fred Weasley", "James Potter", "Myrtle Warren", "Minerva McGonagall", "Viktor Krum", "Arthur Weasley",
            "Percy Weasley", "Argus Filch", "Sybill Trelawney", "Molly Weasley", "Horace Slughorn", "Nymphadora Tonks",
            "Dudley Dursley", "Cho Chang", "Lily Evans Potter", "Aberforth Dumbledore", "Bartemius Crouch Jr.",
            "Sorting Hat", "Garrick Ollivander", "Petunia Dursley", "Narcissa Malfoy", "Vernon Dursley",
            "Justin Finch-Fletchley", "Oliver Wood", "Quirinus Quirrell", "Rita Skeeter");

    private void output(Collection collection) {
        Iterator<Object> it = collection.iterator();
        while (it.hasNext())
            System.out.print(it.next().toString() + ", ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> charactersArrayList = new ArrayList();
        List<String> charactersLinkedList = new LinkedList();
        Set<String> charactersHashSet = new HashSet();
        Set<String> charactersLinkedHashSet = new LinkedHashSet();
        Set<String> charactersTreeSet = new TreeSet();

        for (String character : characters) {
            charactersArrayList.add(character);
            charactersLinkedList.add(character);
            charactersHashSet.add(character);
            charactersLinkedHashSet.add(character);
            charactersTreeSet.add(character);
        }

        Exercise11 exercise = new Exercise11();
        exercise.output(charactersArrayList);
        exercise.output(charactersLinkedList);
        exercise.output(charactersHashSet);
        exercise.output(charactersLinkedHashSet);
        exercise.output(charactersTreeSet);
    }
}