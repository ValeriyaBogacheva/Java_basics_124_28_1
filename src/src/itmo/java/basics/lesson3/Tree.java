package src.itmo.java.basics.lesson3;

public class Tree {
    private int age;
    private Boolean alive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, Boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
