import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to day of week checker\n");
        System.out.print("Enter your day in number: ");
        byte day = input.nextByte();
//        oldSwitch(day);
        newSwitch(day);
    }

    public static void oldSwitch(byte day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: // Fall through
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void newSwitch(byte day)  {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid day";
        };
        System.out.println(dayStr);
    }
}
