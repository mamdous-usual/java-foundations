import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome checker");
        System.out.print("Enter the string to be checked: ");
        String str = input.next();
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Your string is "
                + (isPalindrome ? "Palindrome"
                                : "not Palindrome"));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return  true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
