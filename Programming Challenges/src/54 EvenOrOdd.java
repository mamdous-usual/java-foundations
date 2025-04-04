import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Welcome to even or odd identifier\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        EvenOrOdd ternary = new EvenOrOdd();
        String result = ternary.evenOrOdd(num);
        System.out.println("Your number is " + result);
    }

    public String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
