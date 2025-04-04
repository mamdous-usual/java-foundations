package in.kgcoding.multithreading.testingjoin;

import in.kgcoding.multithreading.runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 started");
        Thread t2 = new Thread(p2);
        t2.start();
        t1.join();
        System.out.println("\n Thread 1 started");
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\n Thread 1 started");
    }
}
