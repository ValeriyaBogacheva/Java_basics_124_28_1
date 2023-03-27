package src.itmo.java.basics.lesson10.ex1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String path = "C:/Users/Lenovo/Desktop/ITMO/9. Java/Java_basics_124_28_1/src/src/itmo/java/basics/lesson10/ex1/input.txt"; // Задача 1
        List<String> stringList = new ArrayList<>(getStringList(path));
        System.out.println(stringList);
    }
    public static List<String> getStringList(String path){
        List<String> stringList = new ArrayList<>();
        try {
            File text = new File(path);
            Scanner reader = new Scanner(text);
            while (reader.hasNextLine()) {
                stringList.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return  stringList;

    }
}
