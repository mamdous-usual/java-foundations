public class Unary {
    public static void main(String[] args) {
        int a = 5;
        int b = -a;
        int z = -b;
        System.out.println(b);
        System.out.println(z);

        System.out.println("\n Testing incrementing and decrementing\n");

        System.out.println("Testing incrementing");
        int p = 5;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(++p);
        System.out.println(p);

        System.out.println("Testing decrementing");
        int q = 7;
        System.out.println(q--);
        System.out.println(q);
        System.out.println(--q);
        System.out.println(q);

    }
}
