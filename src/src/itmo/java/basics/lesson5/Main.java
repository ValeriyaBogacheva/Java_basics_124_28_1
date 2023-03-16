package src.itmo.java.basics.lesson5;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String longText = "Самый длинный текст";
        System.out.println("1) " + longText + " - "+longWord(longText));


        String palindromText = "радар";
        System.out.println("2) " + palindromText +" - "+ palindrom(palindromText));


        String replaceBadWordText = "Бяка купила велосипед";
        System.out.println("3) " + replaceBadWordText + " - " + replaceBadWord(replaceBadWordText,"бяка"));


        String text1 = "Java это  язык программирования. У java есть свои преимущества.";
        String text2 = "java";
        int textCount = text1.toLowerCase().split(text2).length - 1;
        System.out.println("4) " + text1 + " / " + text2 +". Кол-во входов - " + textCount);


        String _invertString = "This is a test string";
        System.out.println("5) " + _invertString + " - " + invertString(_invertString));


    }

    public static String longWord(String str){
        String[] words = str.split(" ");
        int maxleng = 0;
        String word="";
        int index = -1;
        for(int i = 0; i < words.length;i++){
            if(words[i].length() > maxleng){
                index = i;
                word = words[i];
                maxleng = words[i].length();
            }
        }
        if(index != -1)
            return word;
        return "";
    }

    public static boolean palindrom(String str){
        str = str.toLowerCase();
        StringBuilder strBuilder = new StringBuilder(str);
        String reverseStr = strBuilder.reverse().toString();
        if(str.equals(reverseStr)){
            return true;
        }
        return false;
    }

    public static String replaceBadWord(String str,String badWord){
        String[] words = str.split(" ");
        String normalStr="";

        for(int i = 0;i < words.length; i++){
            if(words[i].toLowerCase().equals(badWord.toLowerCase())){
                words[i] = "[вырезано цензурой]";
            }
            normalStr = normalStr + words[i] + " ";
        }
        return normalStr;
    }

    public static String invertString(String str){
        String[] words = str.split(" ");
        String result="";

        for(int i = 0; i < words.length; i++){
            StringBuilder strBuilder = new StringBuilder(words[i]);
            result = result + strBuilder.reverse() + " ";
        }

        return result;
    }
}