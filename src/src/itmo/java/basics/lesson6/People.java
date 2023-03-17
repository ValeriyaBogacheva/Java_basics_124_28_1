package src.itmo.java.basics.lesson6;

public abstract class People implements IPeople{
    private String name;
    private String surname;

    public People(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return  name;
    }
    public String getSurname(){
        return surname;
    }

    public abstract  void display();
}
