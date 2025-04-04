import java.util.Scanner;

class EvenOrOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Even or odd identifier using Bitwise Operator");
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("It's odd!");
        } else {
            System.out.println("It's even");
        }
    }
}
