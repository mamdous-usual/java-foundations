public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[6];
//        myArr[0] = 9;
//        myArr[5] = 5;
//        myArr[4] = 4;
//        myArr[1] = 2;
//        myArr[3] = 8;
//        myArr[2] = 92;
        int[] myArr = {9, 2, 92, 8, 4, 5};
//        int index = 2;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[5]);
        // Array Traversal
        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }

        String[] newArray = new String[4];
        newArray[0] = "Mamdous";
        String[] anotherArray = {"Mamdous", "Ahmed", "Laskar"};
        System.out.println(anotherArray.length);
        System.out.println(newArray.length);
    }
}
