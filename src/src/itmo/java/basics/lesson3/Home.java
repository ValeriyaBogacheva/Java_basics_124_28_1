package src.itmo.java.basics.lesson3;

public class Home {
    private int countFloor;
    private int year;
    private String name;

    public Home() {
    }

    public void Home(int countFloor, int year, String name) {
        this.countFloor = countFloor;
        this.year = year;
        this.name = name;
    }

    public void Print() {
        System.out.println("Кол-во этажей: " + this.countFloor + ". Год стройки: " + this.year + ". Название:" + this.name);
    }

    public String yearBuild() {
        return "Кол-во лет с момента стройки: " + (2023 - this.year);
    }
}
