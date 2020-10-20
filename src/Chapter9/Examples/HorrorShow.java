package Chapter9.Examples;

//: interfaces/HorrorShow.java
// Расширение интерфейса с помощью наследования.

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

public class HorrorShow {
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
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
} ///:~