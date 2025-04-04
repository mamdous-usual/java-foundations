class SumAvg2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average");
        int[][] myArr = ArrayUtility.input2DArray();
        long sum = sum(myArr);
        double avg = avg(myArr);
        System.out.println("Sum of the array is: " + sum);
        System.out.println("Average of the array is: " + avg);

    }

    public static long sum(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg(int[][] arr) {
        double sum = sum(arr);
        double avg = sum / arr.length;

        return avg;
    }
}
