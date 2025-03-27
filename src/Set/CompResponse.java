package src.Set;

import java.util.*;

public class CompResponse {
    public static void itorate() {
        Integer[] numbers = {45, 78, 90, 1, 8, 0, 23};

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(numbers));
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(numbers));

        System.out.println("Iterating->LinkedHashSet:");
        Iterator<Integer> linkedIterator = linkedHashSet.iterator();
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }

        System.out.println("Iterating->TreeSet:");
        Iterator<Integer> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            System.out.print(treeIterator.next() + " ");
        }
    }
    public static void main(String[] args) {
        itorate();
    }
}
