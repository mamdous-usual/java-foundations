class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Check post\n");
        int[] myArr = ArrayUtility.inputArray();
        boolean isIncreasing = isIncreasing(myArr);
        boolean isDecreasing = isDecreasing(myArr);
        if (isIncreasing || isDecreasing) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] myArr) {
        int i = 1;
        while (i < myArr.length) {
            if (myArr[i] < myArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] myArr) {
        int i = 1;
        while (i < myArr.length) {
            if (myArr[i] > myArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
