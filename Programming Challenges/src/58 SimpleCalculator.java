import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator\n");
        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter your second number: ");
        double  num2 = input.nextDouble();
        System.out.print("What you want to do add(+), subtract(-), multiply(*) or divide(/): ");
        String operation = input.next();
        System.out.print("Your answer is: ");
        switch (operation) {
            case "+" :
                System.out.println(num1+num2);
                break;
            case "-" :
                System.out.println(num1-num2);
                break;
            case "*" :
                System.out.println(num1*num2);
                break;
            case "/" :
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("invalid");
        }
    }
}
