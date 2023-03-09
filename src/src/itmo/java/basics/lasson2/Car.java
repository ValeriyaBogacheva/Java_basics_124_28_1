package src.itmo.java.basics.lasson2;

public class Car {
    private String mark;
    private String series;
    private String type;
    private String wheels;
    private String color;
    private String mass;

    public Car() {
        this.mark = "LADA";
        this.series = "Vesta";
        this.type = "Седан";
        this.wheels = "Лето";
        this.color = "Баклажан";
        this.mass = "1886 кг";
    }

    public Car(String mark, String series, String type, String wheels, String color, String mass) {
        this.mark = mark;
        this.series = series;
        this.type = type;
        this.wheels = wheels;
        this.color = color;
        this.mass = mass;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", series='" + series + '\'' +
                ", type='" + type + '\'' +
                ", wheels='" + wheels + '\'' +
                ", color='" + color + '\'' +
                ", mass='" + mass + '\'' +
                '}';
    }
}
