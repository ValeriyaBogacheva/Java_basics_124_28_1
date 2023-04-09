package src.itmo.java.basics.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MainConcurrent {
    /*Цвета вывода в консоль : */
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";

    // Массив всех цветов
    public static final String[] colorArr = new String[]{ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_YELLOW, ANSI_BLUE,
            ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE, ANSI_YELLOW_BACKGROUND, ANSI_BLUE_BACKGROUND};

    // Лист занятых цветов - чтобы каждый поток имел уникальный цвет
    public static final List<Integer> busyColor = new ArrayList<>();


    public static void main(String[] args) throws InterruptedException {

        MainConcurrent mainConcurrent = new MainConcurrent();

        // mainConcurrent.lab1();
        // mainConcurrent.lab2();
        // mainConcurrent.lab3_1method();
        // mainConcurrent.lab3_2method();
        // mainConcurrent.lab4();
    }

    private int generateUniqColor() {

        int colorRandomGenerate = 0;
        do {
            colorRandomGenerate = new Random().nextInt(10);
        } while (busyColor.contains(colorRandomGenerate));

        busyColor.add(colorRandomGenerate);

        return colorRandomGenerate;
    }

    private void lab1() {
        for (int i = 0; i < 10; i++) {

            final int colorRandom1 = generateUniqColor();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println();
                    for (int i = 0; i < 100; i++) {
                        System.out.println(colorArr[colorRandom1] + "Поток с именем - " + Thread.currentThread().getName() + " выводит число: " + i + ANSI_RESET);
                    }
                }
            }).start();
        }
    }

    private void lab2() throws InterruptedException {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        System.out.println("состояние потока :" + myThread.getName() + " до выполенения: " + myThread.getState());

        myThread.start();
        System.out.println("состояние потока :" + myThread.getName() + " во время выполенения: " + myThread.getState());

        myThread.join();
        System.out.println("состояние потока :" + myThread.getName() + " после время выполенения: " + myThread.getState());
    }


    private void lab3_1method() throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 0; i < 100; i++) {
            var t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }
                }
            });
            t.start();
        }

        Thread.sleep(1000);
        System.out.println(counter.getCount());
    }

    private void lab3_2method() throws InterruptedException {
        Counter1 counter = new Counter1();

        for (int i = 0; i < 100; i++) {
            var t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }
                }
            });
            t.start();
        }

        Thread.sleep(1000);
        System.out.println(counter.getCount());
    }

    private void lab4() {
        Object lock = new Object();
        MyThread myThread1 = new MyThread(lock);
        MyThread myThread2 = new MyThread(lock);

        myThread1.start();
        myThread2.start();
    }

}

// lab 3
//1 способ - использывание synchronized
class Counter {

    private int count = 0;

    public synchronized void increment() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}

// lab 3
//2  cпособ - использываение атомарных переменнных
class Counter1 {

    private final AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

// lab4
class MyThread extends Thread {

    public final Object lock;

    public MyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}