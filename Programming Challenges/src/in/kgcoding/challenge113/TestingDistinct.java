package in.kgcoding.challenge113;

import in.kgcoding.challenge107.StreamTest;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,2,3,4,5,7,3,2,5);

        List<Integer> newNumbers =  numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(newNumbers);
    }
}
