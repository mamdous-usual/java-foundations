import java.util.Scanner;

class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter your command: ");
            String command = input.next();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited!");
    }
}
