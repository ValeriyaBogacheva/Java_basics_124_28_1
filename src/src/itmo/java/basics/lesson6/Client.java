package src.itmo.java.basics.lesson6;

public class Client extends People {

    private String bank;
    public Client(String name, String surname,String bank) {
        super(name, surname);
        this.bank = bank;
    }

    public void display() {
        System.out.printf("Данные клиента:\n Имя - %s \n Фамилия - %s \n Банк - %s \n",super.getName(),super.getSurname(),bank);
    }
}

