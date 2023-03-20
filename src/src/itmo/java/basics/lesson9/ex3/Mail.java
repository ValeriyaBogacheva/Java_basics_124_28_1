package src.itmo.java.basics.lesson9.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        Map<User, Integer> users = new HashMap<User, Integer>();
        users = generateMap(users);

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        for (Map.Entry<User, Integer> item : users.entrySet()) {
            if(item.getKey().getName().equals(name)){
                System.out.println(name + " имеет " + item.getValue() + " очков.");
            }
        }
    }
    public static Map<User,Integer> generateMap(Map<User,Integer> users){
        users.put(new User("Анастасия"), 15);
        users.put(new User("Олег"), 12);
        users.put(new User("Павел"), 27);
        users.put(new User("Регина"), 30);
        users.put(new User("Иван"), 25);
        return users;
    }
}
