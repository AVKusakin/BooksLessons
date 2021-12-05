package Chapter10.Examples.controller;

//: innerclasses/controller/Controller.java
// Вместе с классом Event  составляет систему
// управления общего характера:
import java.util.*;

public class Controller {
    // класс из пакета java.util для хранения объектов Event:
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        while (eventList.size() > 0) {
            // Создать копию, чтобы избежать модификации списка
            // во время выборки элементов:
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
} ///:~