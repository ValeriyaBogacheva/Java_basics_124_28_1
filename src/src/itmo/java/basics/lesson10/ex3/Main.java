package src.itmo.java.basics.lesson10.ex3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstPath = "lesson10/ex3/first_input.txt";
        String secondPath = "lesson10/ex3/second_input.txt";
        String outputPath = "lesson10/ex3/output.txt";
        List<String> firstList = reader(firstPath);
        List<String> secondList = reader(secondPath);

        if(writeFile(firstList,outputPath) && writeFile(secondList,outputPath)){
            System.out.println("Успешно");
        }
    }
    public static List<String> reader(String path){
        List<String> stringList = new ArrayList<>();
        Scanner reader=null;
        try {
            File text = new File(path);
            reader = new Scanner(text);
            while (reader.hasNextLine()) {
                stringList.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            if(reader != null){
                reader.close();
            }
        }
        System.out.println(stringList);
        return  stringList;
    }
    public static Boolean writeFile(List<String> list, String path){
        FileWriter writer=null;
        try
        {
            writer = new FileWriter(path , true);

            for(int i = 0; i < list.size();i++){
                writer.write(list.get(i));
                writer.write("\n");
            }
            writer.flush();
            return true;
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}