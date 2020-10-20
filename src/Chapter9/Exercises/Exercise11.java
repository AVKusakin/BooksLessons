package Chapter9.Exercises;

import Chapter9.Examples.interfaceprocessor.*;

/**
 * 11. Создайте класс с методом, который получает аргумент String и переставляет местами каждую пару символов в полученной
 * строке. Адаптируйте класс так, чтобы он работал с interfaceprocessor.Apply.process().
 * @see Chapter9.Examples.interfaceprocessor.Apply
 * date: 20.10.2020
 */
public class Exercise11 {
    public String changeString(String s) {
        char[] sArray = s.toCharArray();
        char[] sArray2 = new char[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            if (i % 2 == 0 && i + 1 < sArray.length) {
                sArray2[i] = sArray[i+1];
                sArray2[i+1] = sArray[i];
            } else if (i % 2 == 0 && i == sArray.length - 1) {
                sArray2[i] = sArray[i];
            }
        }
        return String.valueOf(sArray2);
    }
    public static void main(String[] args) {
        Exercise11 e = new Exercise11();
        Apply.process(new Exercise11Adapter(e), "hTsii  snae axpmelo  ftSirgn.");
    }
}

class Exercise11Adapter implements Processor {
    Exercise11 e;
    public Exercise11Adapter(Exercise11 e) {
        this.e = e;
    }

    public String name() {
        return e.changeString("xEreices11n.ma(e)");
    }

    public String process(Object input) {
        return e.changeString((String)input);
    }
}