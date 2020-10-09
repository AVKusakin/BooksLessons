package Chapter7.Examples;

//: reusing/Orc.java
// Ключевое слово protected.

import static net.mindview.util.Print.*;

class Villain {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villain(String name) {
        this.name = name;
    }
    public String toString() {
        return "Я объект Villain и моё имя " + name;
    }
}

public class Orc extends Villain {
    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name); // доступно, так как объявлено protected
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args) {
        Orc orc = new Orc("Лимбургер", 12);
        print(orc);
        orc.change("Боб",19);
        print(orc);
    }
} /* Output:
Orc 12: Я объект Villain и моё имя Лимбургер
Orc 19: Я объект Villain и моё имя Боб
*///:~