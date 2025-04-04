import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
       greet();
       int firstNum = readNumber();
       int secondNum = readNumber();

       int sum = firstNum + secondNum;
        System.out.println("Sum of the number is: " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = input.nextInt();
        return num;
    }

    public static void greet() {
        System.out.println("Welcome to the Calculator\n");
    }
}
