package in.kgcoding.challenge82;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new int[]{1,3,5,7});
        ArrayOperations.Statistics statistics = arr.new Statistics();
        System.out.println(statistics.mean());
    }
}
