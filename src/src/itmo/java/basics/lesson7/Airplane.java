package src.itmo.java.basics.lesson7;

public class Airplane {
    public Wing leftWing;
    public Wing rightWing;
    public Airplane(float leftWing, float rightWing){
        this.leftWing = new Wing(leftWing);
        this.rightWing = new Wing(rightWing);
    }



    public class Wing{
        private float weight;
        public Wing(float weight){
            this.weight = weight;
        }
        public void getWeight(){
            System.out.println("Вес крыла - " + weight + " кг.");
        }
    }
}
