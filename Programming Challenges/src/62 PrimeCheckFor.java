import java.util.Scanner;

class PrimeCheckFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean result = isPrime(num);
        System.out.println("Your number is " + (result ? "Prime" : "Not Prime"));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
           if (num % 2 == 0) {
               return false;
           }
        }
        return true;
    }
}
