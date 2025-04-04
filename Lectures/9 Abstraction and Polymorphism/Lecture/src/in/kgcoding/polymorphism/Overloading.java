package in.kgcoding.polymorphism;

public class Overloading {
    Overloading() {
        System.out.println("Default constructor called");
    }


    Overloading(String pop) {
        System.out.println(pop);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading overload = new Overloading();
        System.out.println(overload.add(5,7));
        System.out.println(overload.add(5,7,9));
        System.out.println(overload.add("Mamdous ", "Laskar"));
    }
}
