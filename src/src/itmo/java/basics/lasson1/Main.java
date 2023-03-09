package src.itmo.java.basics.lasson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java"); //1

        double x1 = (46 + 10) * (10 / 3.0);
        int x2 = (29) * (4) * (-15);
        System.out.println(x1);
        System.out.println(x2);

        int number = 10500;
        double result = ((double) number / 10) / 10;
        System.out.println(result);

        float a = 3.6f;
        float b = 4.1f;
        float c = 5.9f;
        float abc = a * b * c;
        System.out.println(abc);

        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int e;
        e = scan.nextInt();
        int f = scan.nextInt();
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


        if (e % 2 != 0) {
            System.out.println("Нечетное");
        } else if (e > 100) {
            System.out.println("Выход за пределы диапозона");
        } else {
            System.out.println("Чётное");
        }
    }
}

