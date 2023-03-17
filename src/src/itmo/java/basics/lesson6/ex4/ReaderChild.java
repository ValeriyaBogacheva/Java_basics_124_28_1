package src.itmo.java.basics.lesson6.ex4;

import java.util.Scanner;

public class ReaderChild extends Reader {

    public ReaderChild(Scanner in){
        super(in);
    }
    public void getNumber(){
        System.out.println("Число родителя - " + super.number);
    }
}