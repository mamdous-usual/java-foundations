package in.kgcoding.challenge108;

import java.util.List;

public class StramConcat {
    public static void main(String[] args) {
        List<String> lists = List.of("Mamdous", "Ahmed", "Laskar","Mamdous Ahmed","Mamdous Laskar", "Ahmed Laskar");
        String result = lists.stream()
                .filter(str -> str.length() < 10) // I used it my way that should be > str.length() > 10
                .reduce("",(a, b) -> a + " " + b);

        System.out.println(result);
    }
}
