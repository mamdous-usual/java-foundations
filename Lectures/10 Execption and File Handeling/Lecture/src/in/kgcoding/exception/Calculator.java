package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
       b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter your first number: ");
        int second = input.nextInt();
        try {
            int[] a = new int[4];
//            System.out.printf("Result is: %d", a[5]);
            a[5] = first / second;
            System.out.printf("Result is: %d", a[5]);
        } catch (ArithmeticException exception) {
            System.out.printf("%s, enter valid values\n", exception.getMessage());
        } catch (Throwable throwable) {
            System.out.println("General exception.");
            throw throwable;
        } finally {
            System.out.println("I am using finally");
        }
    }
}
