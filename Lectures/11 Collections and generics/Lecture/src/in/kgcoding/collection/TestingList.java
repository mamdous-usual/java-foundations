package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Mamdous ");
        strList.add("Laskar");
        strList.add(1,"Ahmed ");
        strList.remove(2);

        if (strList.contains("Mamdous ")) {
            System.out.println(strList.indexOf("Mamdous "));
        }

        for (int i = 0; i <= strList.size(); i++) {
//            System.out.print(strList.get(i));
        }

        for (String i : strList) {
            System.out.print(i);
        }
    }
}
