package src.itmo.java.basics.lesson6.ex5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        People people = new People(in);
        people.print();


        People client = new Client(in);
        client.print();


    }
}