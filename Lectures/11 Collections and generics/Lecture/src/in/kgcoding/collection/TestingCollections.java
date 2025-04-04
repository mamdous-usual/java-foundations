package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(-72);
        list.add(4);
        list.add(2);
        list.add(7);
        Utility.print(list);
        Collections.sort(list);
        Utility.print(list);


        Collections.reverse(list);
        Utility.print(list);

        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        unmodifiable.add(5);
    }
}
