package src.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class rangekey {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");
        treeMap.put(4, "four");
        treeMap.put(5, "five");

        SortedMap<Integer, String> subMap = treeMap.subMap(2, 4);

        System.out.println("submap from2 to 4:");
        for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
