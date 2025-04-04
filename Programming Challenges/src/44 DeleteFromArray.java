import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now, enter the number you want to delete from the array: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occurrence = OccurrenceArray.noOfOccurrences(numArr,numToDelete);
        if (occurrence == 0) {
            return numArr;
        }
        int newSize = numArr.length - occurrence;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
