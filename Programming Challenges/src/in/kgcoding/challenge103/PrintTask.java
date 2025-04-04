package in.kgcoding.challenge103;

public class PrintTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Number is: %d\n",i);
        }
    }
}
