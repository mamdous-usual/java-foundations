package in.kgcoding.challenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter your first number: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is: %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                 System.out.println("Division by zero occurs");
            } else {
                throw exception;
            }
        }

    }
}
