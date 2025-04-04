package in.kgcoding.multithreading.runnable;

public class TestingRunnables {
    public static void main(String[] args) {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

//        p1.run(); // This also works
//        p2.run(); // This also works
//        p3.run(); // This also works

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
    }
}
