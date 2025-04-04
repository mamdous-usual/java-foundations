package in.kgcoding.challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways!");
        System.out.println("Using normal way");
        System.out.println(factorial(5));
        System.out.println("Using Functional way");
        int number = 5;
        IntStream.rangeClosed(2,number)
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::println);
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long  sum = 1;
        for (int i = 2; i <= num; i++) {
                sum *= i;
        }

        return sum;
    }
}
