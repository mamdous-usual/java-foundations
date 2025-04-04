package in.kgcoding.collection;
import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Mamdous"));
        System.out.println(names.add("Mamdous"));
        System.out.println(names.add("Yohan"));
        System.out.println(names.add("Pandey"));
        System.out.println(names.add("Ojjisa"));
        Utility.print(names);
        System.out.println(names.size());

        System.out.println(names.contains("Mamdous"));
        System.out.println(names.remove("Mamdous"));
        Utility.print(names);
    }
}
