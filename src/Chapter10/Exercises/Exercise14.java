package Chapter10.Exercises;

/**
 * 14. Измените пример interfaces/HorrorShow.java, реализовав DangerousMonster и Vampire как анонимные классы.
 * @see Chapter9.Examples.HorrorShow
 * date: 11.09.2021
 */
interface Monster {
    void menance();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void menance() {}
    public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menance() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

public class Exercise14 {
    static void u(Monster b) {
        b.menance();
    }
    static void v(DangerousMonster d)  {
        d.menance();
        d.destroy();
    }
    static void w(Lethal l) {
        l.kill();
    }

    public DangerousMonster getDangerousMonster() {
        return new DangerousMonster() {
            public void menance() {

            }
            public void destroy() {
            }
        };
    }

    public Vampire getVampire() {
        return new Vampire() {
            public void drinkBlood() {

            }
            public void kill() {

            }
            public void destroy() {

            }
            public void menance() {
            }
        };
    }

    public static void main(String[] args) {
        Exercise14 exercise = new Exercise14();
        DangerousMonster barney = new DragonZilla();
        DangerousMonster barney2 = exercise.getDangerousMonster();
        u(barney);
        v(barney);
        u(barney2);
        v(barney2);

        Vampire vlad = new VeryBadVampire();
        Vampire vlad2 = exercise.getVampire();
        u(vlad);
        v(vlad);
        w(vlad);
        u(vlad2);
        v(vlad2);
        w(vlad2);
    }
}