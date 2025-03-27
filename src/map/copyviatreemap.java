package src.map;

import java.util.Map;
import java.util.TreeMap;

public class copyviatreemap {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap1 = new TreeMap<>();
        treeMap1.put("A", "Apple");
        treeMap1.put("G", "Guava");
        treeMap1.put("K", "Kiwi");

        TreeMap<String, String> treeMap2 = new TreeMap<>(treeMap1);

        System.out.println("Copied TreeMap:");
        for (Map.Entry<String, String> entry : treeMap2.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
