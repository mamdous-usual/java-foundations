public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("before loop");
//        for (int i = 1; i <= 1000; i++) {
//            if (i == 101) {
//                break;
//            }
//            System.out.println(i);
//        }

        for (int i = 1; i <= 100; i++) {
            if (i == 83 ) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
