package src.itmo.java.basics.lesson6.ex4;

import java.util.Scanner;

public class Reader {
    protected int number;
    public Reader(Scanner in){
        System.out.println("Введите число");
        number = in.nextInt();
    }
}