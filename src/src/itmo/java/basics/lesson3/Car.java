package src.itmo.java.basics.lesson3;

public class Car {
    private String color;
    private String name;
    private String mass;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, String mass) {
        this.color = color;
        this.mass = mass;
    }

    public void Print() {
        System.out.println("Цвет: " + this.color + ". Название: " + this.name + ". Вес: " + this.mass);
    }
}
