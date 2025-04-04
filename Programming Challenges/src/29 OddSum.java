import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = Oddsum(num);
        System.out.println("Odd sum till " + num + " is: " + sum);
    }

    public static int Oddsum(int num) {
        int sum = 0;
        int i = 1;
        while (i <=num) {
            sum += i;
            i += 2;
        }
        return sum;

    }
}
