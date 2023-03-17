package src.itmo.java.basics.lesson6;

public class Worker extends  People{
    private String bank;
    public Worker(String name, String surname,String bank) {
        super(name, surname);
        this.bank = bank;
    }

    public void display() {
        System.out.printf("Данные работника:\n Имя - %s \n Фамилия - %s \n Банк - %s \n",super.getName(),super.getSurname(),bank);
    }
}
