public class Function {
    public static void main(String[] args) {
        printFirstPattern();
//        printSecondPattern();
//        printThirdPattern();
    }

    public static void printFirstPattern() {
        System.out.println("Right Half Pyramid");
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int column = 0;
            while (column < rows) {
                System.out.print(" *");
                column++;
            }
            rows++;
            System.out.println();
        }
    }

    public static void printSecondPattern() {
        System.out.println("Reverse Right Half Pyramid");
        System.out.println("* * * * *\n* * * *\n* * *\n* *\n*");
        System.out.println();
    }

    public  static void printThirdPattern() {
         System.out.println("Left Half Pyramid");
        System.out.println("        *\n      * *\n    * * *\n  * * * *\n* * * * *");
    }
}
