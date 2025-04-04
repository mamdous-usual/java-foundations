import java.util.Scanner;

class MonthOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to month of the year checker\n");
        System.out.print("Please enter the number of month: ");
        byte num = input.nextByte();
        MonthOfTheYear result = new MonthOfTheYear();
        String monthOf = result.month(num);
        System.out.println("The month is: " + monthOf);

    }

    public String month(int num) {
        String month = switch (num) {
         case 1 -> "January";
         case 2 -> "February";
         case 3 -> "March";
         case 4 -> "April";
         case 5 -> "May";
         case 6 -> "June";
         case 7 -> "July";
         case 8 -> "August";
         case 9 -> "September";
         case 10 ->  "October";
         case 11 -> "November";
         case 12 -> "December";
         default -> "Invalid";
        };
        return month;
    }
}
