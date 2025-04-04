import java.util.Scanner;

class PrintPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to print patterns\n");
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        rightHalfPyramid(rows);
        reverseRightHalfPyramid(rows);
        leftHalfPyramid(rows);
    }

    public static void rightHalfPyramid(int maxRows) {
        System.out.println("\nRight Half Pyramid\n");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void reverseRightHalfPyramid(int maxRows) {
        System.out.println("\nReverse Half Pyramid\n");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

  public static void leftHalfPyramid(int maxRows) {
        System.out.println("\nLeft Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }
            // this loop prints stars
            int i = 0;
            while (i <= (maxRows-rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
