package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        map.put("Mamdous",81);
        map.put("Majid", 87);
        map.put("Sajan",65);
        map.put("Meshab",62);

        System.out.println(map.size());
        System.out.println(map.get("Mamdous"));
        System.out.println(map.containsKey("Majid"));
        System.out.println(map.containsKey("Mehbub"));
        System.out.println(map.remove("Meshab"));

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));

        }
    }
}
