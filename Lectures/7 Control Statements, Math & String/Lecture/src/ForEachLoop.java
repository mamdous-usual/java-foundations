public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Ram", "Shyam", "Mohan", "Sohan", "Sita", "Geeta"
        };

        printArray(array);
        System.out.println();
        printForEachArry(array);
    }

    public static void printForEachArry(String[] array) {
        for (String name : array) {
            System.out.println(name);
        }
    }
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
