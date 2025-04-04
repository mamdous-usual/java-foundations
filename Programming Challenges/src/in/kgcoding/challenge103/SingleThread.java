package in.kgcoding.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            PrintTask task = new PrintTask();
            service.submit(task);
        }

    }
}
