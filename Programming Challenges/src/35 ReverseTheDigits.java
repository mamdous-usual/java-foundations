import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse the digits\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Your reversed number is: " + reverse);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = (newNum * 10) + digit;
            num /= 10;
        }
        return newNum;
    }
}

