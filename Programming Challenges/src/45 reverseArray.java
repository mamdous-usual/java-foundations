class reverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array reversal\n");
        int[] myArr = ArrayUtility.inputArray();
        reverse(myArr);
        System.out.println("Your reversed array is");
        ArrayUtility.displayArray(myArr);

    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length -1) - i] = swap;
            i++;
        }
    }
}
