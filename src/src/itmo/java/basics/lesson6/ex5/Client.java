package src.itmo.java.basics.lesson6.ex5;

import java.util.Scanner;

public class Client extends People{

    public Client(Scanner in){
        super(in);
    }

    @Override
    public void print(){
        System.out.println("Имя пользователя - " + super.name);
    }
}
