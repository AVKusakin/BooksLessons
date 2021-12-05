package Chapter10.Exercises;

import Chapter10.Examples.controller.*;

/**
 * 25. Унаследуйте от класса GreenhouseControls, чтобы добавить в него новый внутренний класс событий Event, включающий
 * и отключающий поддержку увлажнения оранжереи. Напишите новую версию программы GreenhouseController.java, обеспечивающую
 * поддержку нового типа события.
 * @see Chapter10.Examples.GreenhouseControls
 * @see Chapter10.Examples.GreenhouseController
 * date: 05.12.2021
 */
class GreenhouseControlsDescendant extends Chapter10.Examples.GreenhouseControls {
    private boolean hydrationSupport = false;
    public class HydrationSupportOn extends Event {
        public HydrationSupportOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            hydrationSupport = true;
        }
        public String toString() {
            return "Поддержка увлажнения включена";
        }
    }
    public class HydrationSupportOff extends Event {
        public HydrationSupportOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            hydrationSupport = false;
        }
        public String toString() {
            return "Поддержка увлажнения выключена";
        }
    }
}

class NewGreenhouseController {
    public static void main(String[] args) {
        GreenhouseControlsDescendant gc = new GreenhouseControlsDescendant();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new HydrationSupportOn(1000),
                gc.new HydrationSupportOff(1200),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControlsDescendant.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}

public class Exercise25 {
    public static void main(String[] args) {
        NewGreenhouseController.main(new String[] {"5000"});
    }
}