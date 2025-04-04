import java.util.Scanner;

class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise NOT/Compliment Operator");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("The result is: " + result);
    }
}

