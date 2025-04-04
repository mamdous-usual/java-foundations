import java.util.Scanner;

class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to occurrences finder");
        int[] myArr = ArrayUtility.inputArray();
        System.out.print("Now, enter the number you want to find: ");
        int num = input.nextInt();
        int occur = 0;
        for (int number: myArr) {
            if ( number == num) {
                occur++;
            }
        }
        System.out.println(occur + " occurrences found");

    }
}
