import java.util.Scanner;

class GuessingGame {
    int random;
    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNumber the number that player guessed
     * @return
     * - Negative if guessed number is smaller.
     *  - Positive if guessed number is higher.
     *  - 0 if guessed number is correct.
     */

    int guess( int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to guessing game. Enter the number between 1-100");
        int guess;
        int result;
        int tries = 0;

        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("Congrats, your guess is correct!");
            } else if (result < 0) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High");
            }

            tries++;
        } while (result != 0);
        System.out.printf("You get it in %d tries", tries);
    }
}
