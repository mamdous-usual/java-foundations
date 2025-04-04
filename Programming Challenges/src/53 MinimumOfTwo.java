import java.util.Scanner;

class MinimumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();
        MinimumOfTwo ternary = new MinimumOfTwo();
        int minimum = ternary.min(num1,num2);
        System.out.println(minimum + " is minimum");
    }

    public int min(int num1, int num2) {
       return num1 < num2 ? num1 : num2;
    }
}
