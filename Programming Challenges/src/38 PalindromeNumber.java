import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome number checker\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("This is a Palindrome number");
        } else {
            System.out.println("This is not a Palindrome number");
        }
    }

    public static boolean isPalindrome(int num) {
        int reverse = reverseTheNumber(num);

        return reverse == num;
    }

    public static int reverseTheNumber(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = (newNum * 10) + digit;
            num /= 10;
        }
        return newNum;
    }
}
