package src.itmo.java.basics.lesson7;

public class Main {
    public static void main(String[] args) {
        Airplane ship = new Airplane(250,251);
        ship.leftWing.getWeight();
        ship.rightWing.getWeight();

        Airplane anotherShip = new Airplane(275.5f,275.91f);
        anotherShip.leftWing.getWeight();
        anotherShip.rightWing.getWeight();
    }
}
