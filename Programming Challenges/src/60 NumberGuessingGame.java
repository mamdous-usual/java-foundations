import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game\n");
        int num = 5;
        int guess;
        int tries = 0;
        do {
           System.out.print("Enter your guess between (1-10): ");
           guess = input.nextInt();
           tries++;
        } while (guess != num);
        System.out.println("Woohoo! You get it " + tries + " tries");
    }
}
