class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker\n");
        int[] myArr = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(myArr);
        if (isPalindrome) {
            System.out.println("Your number is Palindrome");
        } else {
            System.out.println("Your number is not Palindrome");
        }
    }

    public static boolean isPalindrome(int[] myArr) {
        int i = 0;
        while (i < myArr.length / 2) {
            if (myArr[i] != myArr[myArr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
