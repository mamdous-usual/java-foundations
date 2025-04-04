package in.kgcoding.multithreading.runnable;

public class PrintTask implements Runnable{
    @Override
    public void run() {
         // Print Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:%c ", i,targetChar);
        }
        System.out.printf("\n %s %c task complete",Thread.currentThread().getName(),
                targetChar);
    }

    private char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
