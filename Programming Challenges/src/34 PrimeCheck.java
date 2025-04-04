import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime number checker\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean result = isPrime(num);
        if (result)  {
            System.out.println("This number is Prime");
        } else {
            System.out.println("This number is not Prime");
        }
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
