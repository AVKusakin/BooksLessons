package Chapter10.Exercises;

import Chapter9.Examples.interfaceprocessor.Apply;
import Chapter9.Examples.interfaceprocessor.Processor;

/**
 * 16. Измените решение упражнения 11 из главы 9 так, чтобы в нём использовались анонимные внутренние классы.
 * @see Chapter9.Exercises.Exercise11
 * date: 11.09.2021
 */
public class Exercise16 {
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
        Exercise16 e = new Exercise16();
        Apply.process(adapter(e), "hTsii  snae axpmelo  ftSirgn.");
    }

    public static Processor adapter(Exercise16 e) {
        return new Processor() {
            public String name() {
                return e.changeString("xEreices61n.ma(e)");
            }

            public Object process(Object input) {
                return e.changeString((String)input);
            }
        };
    }
}