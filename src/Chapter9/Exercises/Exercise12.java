package Chapter9.Exercises;

/**
 * 12. Добавьте в пример Adventure.java интерфейс CanClimb, созданный по образцу других интерфейсов.
 * @see Chapter9.Examples.Adventure
 * date: 20.10.2020
 */
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() {}
    public void fly() {}
    public void climb() {}
}

class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void u(CanSwim x) {
        x.swim();
    }
    public static void v(CanFly x) {
        x.fly();
    }
    public static void w(ActionCharacter x) {
        x.fight();
    }
    public static void y(CanClimb x) {
        x.climb();
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Adventure.t(hero);
        Adventure.u(hero);
        Adventure.v(hero);
        Adventure.w(hero);
        Adventure.y(hero);
    }
}