package src.itmo.java.basics.lasson2;

import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        Car car = new Car();

        System.out.println(car);

        Calculator calc = new Calculator();
        System.out.println("----" + calc.division(5,2));

        System.out.println(calc.substract(5.2,5));

        Car car1 = new Car();
        Car car2 = new Car("BMW","M5","Седан","Зима","Черный","2000 кг");
        System.out.println(car1.getMark());
        System.out.println(car2.getMark() +" "+ car2.getSeries() +" "+ car2.getColor());
    }
}
// Lab_02