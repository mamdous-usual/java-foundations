import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 1; // initialization
        while (num <= 10) { // condition
            System.out.println(num); // actual work
            num = num + 1; // updating the condition
        }

        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count -= 1;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = 0;

        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("The number is: " + inp);
            i++;
        }
    }
}
