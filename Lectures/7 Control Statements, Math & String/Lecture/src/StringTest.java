public class StringTest {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("First: ");
        str.append(45);
        str.append(", Second: ");
        str.append(49);
        System.out.println(str);
    }
}
