package in.kgcoding.multithreading.threadclass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstClass t1 = new FirstClass();
        SecondClass t2 = new SecondClass();
        ThirdClass t3 = new ThirdClass();

        System.out.printf("\n %s Starting first Thread ",Thread.currentThread().getName());
        t1.start();
        System.out.printf("\n %s Starting second Thread ",Thread.currentThread().getName());
        t2.start();
        System.out.printf("\n %s Starting third Thread ",Thread.currentThread().getName());
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d ",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}
