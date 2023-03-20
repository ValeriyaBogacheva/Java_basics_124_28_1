package src.itmo.java.basics.lesson9.ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();    // Задача 2
        List<Integer> secondList = new LinkedList<>();
        Random random = new Random();

        long time = System.currentTimeMillis();
        firstList = addElements(firstList, random);
        int firstRandomElement = getRandomElement(firstList,random);
        System.out.println(System.currentTimeMillis() - time + "мс.");

        time = System.currentTimeMillis();
        secondList = addElements(secondList, random);
        int secondRandomElement = getRandomElement(secondList,random);
        System.out.println(System.currentTimeMillis() - time + "мс.");
    }
    public static List<Integer> addElements(List<Integer> list, Random rand){

        for(int i = 0 ; i < 1000000;i++){
            list.add(rand.nextInt(100));
        }

        return list;
    }
    public  static int getRandomElement(List<Integer> list, Random rand){
        int randomInt = 0;
        for(int i = 0 ; i < 100000;i++){
            randomInt = list.get(rand.nextInt(0,list.size()-1));
        }
        return randomInt;
    }

}