package src.itmo.java.basics.lesson6.ex1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван","Иванов","Сбербанк"); // 1 Задание
        client.display();
        Worker worker = new Worker("Александр","Александров","Тинькофф");
        worker.display();

        IPeople client1 = new Client("Максим","Максимов","Уралбанк");   // 2 Задание
        client1.display();
        IPeople worker2 = new Worker("Анастасия","Осипова","ВТБ");
        worker2.display();

    }
}
