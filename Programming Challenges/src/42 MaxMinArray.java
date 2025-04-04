class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum Minimum search");
        int[] myArr = ArrayUtility.inputArray();
        int max = max(myArr);
        int min = min(myArr);
        System.out.println("The maximum element in this array is " + max);
        System.out.println("The minimum element is this array is: " + min);
    }

    public static int max(int[] myArr) {
        if (myArr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = myArr[0];
        int i = 1;
        while (i < myArr.length) {
            if (max < myArr[i]) {
                max = myArr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] myArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < myArr.length) {
            if (min > myArr[i]) {
                min = myArr[i];
            }
            i++;
        }
        return min;
    }
}
