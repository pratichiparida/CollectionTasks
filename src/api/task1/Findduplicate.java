package src.api.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Findduplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 5, 6);
        Set<Integer> found = new HashSet<>(), duplicates = new HashSet<>();
        for (int num : numbers) {
            if (!found.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }
}
