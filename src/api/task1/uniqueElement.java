package src.api.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class uniqueElement {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
        Set<Integer> unique = new HashSet<>(list1);
        unique.addAll(list2);
        unique.removeAll(list1.stream().filter(list2::contains).toList());
        System.out.println(unique);
    }
}
