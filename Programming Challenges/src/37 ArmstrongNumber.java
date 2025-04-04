import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong number checker\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("This number is an Armstrong number");
        } else {
            System.out.println("This number is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber = power(lastDigit,noOfDigits);
        }
        return finalNumber == numCopy;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }

    public static int power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while ( i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }
}
