package in.kgcoding.challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Mamdous ", "Ahmed ", "Laskar");
        names.stream().forEach(name -> System.out.println(name));
    }
}
