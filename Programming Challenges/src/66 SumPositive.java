class SumPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive numbers");
        int[] arr = ArrayUtility.inputArray();

        int sum = 0;
        for(int num:arr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("Sum of the positive numbers is: " + sum);
    }
}
