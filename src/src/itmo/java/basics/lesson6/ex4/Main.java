package src.itmo.java.basics.lesson6.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ReaderChild reader = new ReaderChild(in);
        reader.getNumber();


    }
}

