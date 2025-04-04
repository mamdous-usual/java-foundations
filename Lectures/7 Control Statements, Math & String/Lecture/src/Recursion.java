import java.sql.PreparedStatement;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial generator\n");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
//        long factorItr = factorialIterative(num);
        long factor = factor(num);
        System.out.println("Your factorial is: " + factor);
    }

    public static long factor(int num)  {
        System.out.println("Function called for: " + num);
        if (num == 1) {
            return 1;
        }
        return num * factor(num - 1);
    }

    public static long factorialIterative(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
           result *= i;
        }
        return result;
    }
}
