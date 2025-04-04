class DiagonalSum2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to diagonal sum");
        int[][] myArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonals(myArr);
        System.out.println("The sum of diagonal elements is: " + sum);
    }

    public static long sumOfDiagonals(int[][] arr) {
        long leftSum = sumOfLeftDiagonals(arr);
        long rightSum = sumOfRightDiagonals(arr);
        long sum = leftSum + rightSum;
        if (arr.length % 2 != 0) {
            int index = arr.length / 2;
            sum -= arr[index][index];
        }
        return sum;
    }

    public static long sumOfRightDiagonals(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = (arr.length - 1) - i;
            sum += arr[i][j];
            i++;
        }
        return sum;
    }

    public static long sumOfLeftDiagonals(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i][i];
            i++;
        }
        return sum;
    }
}
