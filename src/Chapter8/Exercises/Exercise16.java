package Chapter8.Exercises;

/**
 * 16. По образцу Transmogrify.java создайте класс Starship со ссылкой на объект AlertStatus, который может обозначать
 * одно из трех состояний. Включите методы для изменения состояния.
 * @see Chapter8.Examples.Transmogrify
 * date: 17.10.2020
 */
class AlertStatus {
    public void showStatus() {}
}

class GoodStatus extends AlertStatus {
    public void showStatus() {
        System.out.println("All is good.");
    }
}

class NormalStatus extends AlertStatus {
    public void showStatus() {
        System.out.println("It's OK.");
    }
}

class BadStatus extends AlertStatus {
    public void showStatus() {
        System.out.println("We will all die.");
    }
}

class Starship {
    private AlertStatus status = new GoodStatus();
    public void changeTON() {
        status = new NormalStatus();
    }
    public void changeTOG() {
        status = new GoodStatus();
    }
    public void changeTOB() {
        status = new BadStatus();
    }
    public void performShow() {
        status.showStatus();
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.performShow();
        starship.changeTON();
        starship.performShow();
        starship.changeTOB();
        starship.performShow();
        starship.changeTOG();
        starship.performShow();
        starship.changeTOB();
        starship.performShow();
    }
}