package src.itmo.java.basics.lesson10.ex1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "lesson10/ex1/input.txt"; // Задача 1
        List<String> stringList = new ArrayList<>(getStringList(path));
        System.out.println(stringList);
    }
    public static List<String> getStringList(String path){
        List<String> stringList = new ArrayList<>();
        Scanner reader = null;

        try {
            File text = new File(path);
            reader = new Scanner(text);
            while (reader.hasNextLine()) {
                stringList.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(reader != null){
                reader.close();
            }
        }
        return  stringList;

    }
}