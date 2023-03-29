package src.itmo.java.basics.lesson9.ex2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String path = "lesson10/ex2/output.txt";
        if(writeFile("Java язык программирования",path)){
            System.out.println("Успешно");
        }
    }
    public static Boolean writeFile(String text,String path){
        FileWriter writer=null;
        try
        {
            writer = new FileWriter(path, false);
            writer.write(text);
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
