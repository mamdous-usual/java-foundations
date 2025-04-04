package in.kgcoding.lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        System.out.println(test.sum(5,7));
        test.printString("This is the best Java course available on YouTube");

//        toPrint -> System.out.println(toPrint);
//        (a, b) -> a + b;
//        (a, b) -> {
//            int sum = a + b;
//            System.out.println(sum);
//        }
    }

    private  int sum(int a, int b) {
        return  a + b;
    }

    private  void printString(String toPrint) {
        System.out.println(toPrint);
    }
}
