public class StringFormat {
    public static void main(String[] args) {
        String name = "Meow";
        int marks = 45;
        System.out.printf("Hello %s, your marks are %d\n", name, marks);
        System.out.printf("Hello %S, your marks are %d\n", name, marks);
        System.out.printf("Hello %10s, your marks are %d\n", name, marks);
        System.out.printf("Hello %-10s, your marks are %d\n", name, marks);
    }
}
