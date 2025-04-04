public class Parameter {
    public static void main(String[] args) {
        System.out.println("Sum of two number is: "+ sumTwoNumbers(4,6));
        System.out.println("Sum of two number is: "+ sumTwoNumbers(7,3));
        System.out.println("Sum of two number is: "+ sumTwoNumbers(9,1));
    }

    public static int sumTwoNumbers(int first, int second) {
        System.out.println("First number received: " + first);
        System.out.println("Second number received: " + second);
        int sum = first + second;
        return  sum;
    }
}
