package in.kgcoding.multithreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // First Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * task complete");

        // Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n $ task complete");


        // Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n # task complete");

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d", (endTime - startTime));
    }
}
