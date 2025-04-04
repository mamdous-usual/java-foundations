import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absolute value\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}
