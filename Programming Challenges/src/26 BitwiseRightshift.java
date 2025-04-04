import java.util.Scanner;

class BitwiseRightshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise RightShift Operator");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("The result is: " + result);
    }
}

