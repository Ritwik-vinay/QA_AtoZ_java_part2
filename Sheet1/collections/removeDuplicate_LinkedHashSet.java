package collections;

import java.util.*;

public class removeDuplicate_LinkedHashSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> result = new ArrayList(set);

        System.out.println(result);


    }
}
class removeDupe{
    void removeDupe(){}
}
