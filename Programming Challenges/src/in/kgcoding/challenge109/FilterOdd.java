package in.kgcoding.challenge109;

import java.util.List;

public class FilterOdd {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);

        nums.stream().filter(num -> num % 2 == 1)
               .forEach(num -> System.out.println(num));
    }
}
