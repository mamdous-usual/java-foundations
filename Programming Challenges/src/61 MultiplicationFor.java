import java.util.Scanner;

class MultiplicationFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table generator\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        System.out.print("Now, enter your range: ");
        int range = input.nextInt();
        for (int i = 1; i <= range; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
