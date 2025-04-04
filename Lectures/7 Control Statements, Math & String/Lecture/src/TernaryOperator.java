import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter your first number: ");
        int num2 = input.nextInt();

        int greater = num1 > num2 ? num1 : num2;
//        int greater;
//        if (num1 > num2) {
//            greater = num1;
//        } else {
//            greater = num2;
//        }

        System.out.println(greater +" is the greater number");

    }
}
