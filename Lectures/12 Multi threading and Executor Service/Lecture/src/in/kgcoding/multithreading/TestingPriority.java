package in.kgcoding.multithreading;

import com.sun.jdi.event.ThreadDeathEvent;
import in.kgcoding.multithreading.runnable.PrintTask;

public class TestingPriority {
    public static void main(String[] args) {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

//        p1.run(); // This also works
//        p2.run(); // This also works
//        p3.run(); // This also works

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        Thread t2 = new Thread(p2);
//        t2.setPriority(7); // Can be used with number between 1-10
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();
    }
}
