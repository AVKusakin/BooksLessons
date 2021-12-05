package Chapter10.Exercises;

import Chapter10.Examples.controller.*;

/**
 * 24. В программу GreenhouseControls.java добавьте внутренние классы для события Event, отключающие и включающие
 * проветривание оранжереи. Настройте программу GreenhouseController.java на использование нового типа события.
 * @see Chapter10.Examples.GreenhouseControls
 * @see Chapter10.Examples.GreenhouseController
 * date: 05.12.2021
 */
class GreenhouseControls1 extends Controller {
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

    private boolean aeration = false;
    public class AerationOn extends Event {
        public AerationOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            aeration = true;
        }
        public String toString() {
            return "Проветривание включено";
        }
    }
    public class AerationOff extends Event {
        public AerationOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            aeration = false;
        }
        public String toString() {
            return "Проветривание выключено";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() {
            return "Бам!";
        }
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }
        public void action() {
            for (Event e : eventList) {
                e.start(); // Перезапуск каждого события
                addEvent(e);
            }
            start(); // Перезапуск текущего события
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

class GreenhouseController1 {
    public static void main(String[] args) {
        GreenhouseControls1 gc = new GreenhouseControls1();

        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new AerationOn(1000),
                gc.new AerationOff(1200),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls1.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}

public class Exercise24 {
    public static void main(String[] args) {
        GreenhouseController1.main(new String[] {"5000"});
    }
}