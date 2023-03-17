package src.itmo.java.basics.lesson6.ex3;

public class Truck extends Car{
    private int wheels;
    private float maxWeight;
    public Truck(int w, String m, char c, float s,int wheels, float maxWeight){
        super(w,m,c,s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }
    public void newWheels(int wheels){
        this.wheels = wheels;
        System.out.println("Кол-во колес: "+this.wheels);
    }
}