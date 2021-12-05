package Chapter10.Examples;

//: innerclasses/GreenhouseController.java
// Настройка и запуск системы управления.
// {Args: 5000}
import Chapter10.Examples.controller.*;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // Вместо жесткой фиксации параметров в коде
        // можно было бы считать информацию
        // из текстового файла:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
} /* Output:
Бам!
Термостат использует ночной режим
Свет включен
Свет выключен
Полив включен
Полив выключен
Термостат использует дневной режим
Перезапуск системы
Отключение
*///:~