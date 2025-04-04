package in.kgcoding.methodreferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodReferences {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 8);
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));

        numbers.stream()
                .reduce(0, Integer::sum);

        numbers.stream()
                .reduce(0, (a, b) -> a + b);
    }
}
