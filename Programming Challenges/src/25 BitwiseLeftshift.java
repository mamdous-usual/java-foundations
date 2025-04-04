import java.util.Scanner;

class BitwiseLeftshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise LeftShift Operator");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("The result is: " + result);
    }
}

