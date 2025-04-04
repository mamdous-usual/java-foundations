package in.kgcoding.multithreading.threadclass;

public class SecondClass extends Thread{
    @Override
    public void run() {
         // Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n $ task complete");
    }
}
