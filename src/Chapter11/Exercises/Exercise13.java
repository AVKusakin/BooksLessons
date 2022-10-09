package Chapter11.Exercises;

import Chapter10.Examples.controller.*;

import java.util.*;
import static java.lang.Integer.parseInt;

/**
 * 13. В примере innerclasses/GreenHouseController.java класс Controller использует ArrayList. Измените код так, чтобы в
 * нем использовался класс LinkedList, и организуйте перебор множества событий с использованием Iterator.
 * @see Chapter10.Examples.GreenhouseController
 * date: 09.10.2022
 */
class Controller {
    private List<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() throws InterruptedException {
        Iterator<Event> it = eventList.iterator();
        while (it.hasNext()) {
            Event e = it.next();
            if (e.ready()) {
                System.out.println(e);
            }
        }
    }
}

class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            light = true;
        }
        public String toString() {
            return "Свет включен";
        }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            light = false;
        }
        public String toString() {
            return "Свет выключен";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            water = true;
        }
        public String toString() {
            return "Полив включен";
        }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            water = false;
        }
        public String toString() {
            return "Полив выключен";
        }
    }

    private String thermostat = "День";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        public void action() {
            thermostat = "Ночь";
        }
        public String toString() {
            return "Термостат использует ночной режим";
        }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        public void action() {
            thermostat = "День";
        }
        public String toString() {
            return "Термостат использует дневной режим";
        }
    }
    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }
        public void action() {
            addEvent(new GreenhouseControls.Bell(delayTime));
        }
        public String toString() {
            return "Бам!";
        }
    }
    public class Restart extends Event {
        private List<Event> eventList;
        public Restart(long delayTime, List<Event> eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString() {
            return "Перезапуск системы";
        }
    }
    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }
        public void action() {
            System.exit(0);
        }
        public String toString() {
            return "Отключение";
        }
    }
}

public class Exercise13 {
    public static void main(String[] args) throws InterruptedException {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        List<Event> eventList1 = new ArrayList<>();
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        eventList1.addAll(Arrays.asList(eventList));

        gc.addEvent(gc.new Restart(2000, eventList1));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(parseInt(args[0])));
        }
        gc.run();
    }
}