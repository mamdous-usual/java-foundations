import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long factor = factorial(num);
        System.out.println("Factorial is: " + factor);
    }

    public static long factorial(int num) {
       if (num < 2) {
           return 1;
       }
       long factor = 1;
       int i = 2;
       while (i <= num) {
           factor *= i;
           i++;
       }
       return factor;
    }
}
