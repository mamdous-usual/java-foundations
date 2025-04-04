import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = {28,25,83,93, 28, 39, 29, 23, 77, 20};
        System.out.println("Welcome to array searching");
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(myArr, num);
        if (isFound) {
            System.out.println("Number was found in the array");
        } else {
            System.out.println("Number was not found in the array");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
