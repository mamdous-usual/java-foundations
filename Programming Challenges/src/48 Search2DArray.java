import java.util.Scanner;

class Search2DArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to 2D search\n");
         int[][] myArr = ArrayUtility.input2DArray();
         System.out.println("Now, enter the number you want to search");
         int num = input.nextInt();
         boolean isFound = isFound(myArr, num);
         if (isFound) {
             System.out.println("Your number was found");
         } else {
             System.out.println("Your number was not found");
         }
     }

     public static boolean isFound(int[][] myArr, int num) {
         int i = 0;
         while (i < myArr.length) {
             int j = 0;
             while (j < myArr[i].length) {
                 if (myArr[i][j] == num) {
                     return true;
                 }
                 j++;
             }
             i++;
         }
        return false;
     }
}
