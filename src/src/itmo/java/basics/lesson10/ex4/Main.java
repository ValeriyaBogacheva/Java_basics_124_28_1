package src.itmo.java.basics.lesson10.ex4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "lesson10/ex4/inoutput.txt";
        List<String> stringList = reader(path);
        System.out.println(stringList);
        stringList = changeList(stringList);
        System.out.println(stringList);

        if (writer(stringList, path)) {
            System.out.println("Успешно");
        }
    }

    public static List<String> reader(String path) {
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
        return stringList;
    }

    public static Boolean writer(List<String> list, String path) {
        FileWriter writer=null;
        try {
            writer = new FileWriter(path, false);

            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
                writer.write("\n");
            }
            writer.flush();
            return true;
        } catch (IOException e) {
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

    public static List<String> changeList(List<String> list) {

        List<String> newStringList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] line = list.get(i).split(" ");
            String text = "";
            for (int j = 0; j < line.length; j++) {
                for (int k = 0; k < line[j].length(); k++) {
                    if (!Character.isLetterOrDigit(line[j].charAt(k))) {
                        line[j] = line[j].replace(line[j].charAt(k), '$');
                    }
                }
                text = (text + line[j] + " ");
            }
            newStringList.add(text.trim());
        }
        return newStringList;
    }
}
