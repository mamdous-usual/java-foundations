package in.kgcoding.challenge99;

public class HelloThread extends Thread{
     private final int threadNumber;

    public HelloThread(int thread) {
        this.threadNumber = thread;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
           System.out.printf("(%d) %s Hello, I am in %dnd thread\n",(i),Thread.currentThread().getName(),threadNumber);
        }
    }
}
