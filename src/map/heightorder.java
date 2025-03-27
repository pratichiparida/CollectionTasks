package src.map;

import java.util.Map;
import java.util.TreeMap;

public class heightorder {
    public static void main(String[] args) {
        TreeMap<String, Double> personHeight = new TreeMap<>();
        personHeight.put("a", 6.0);
        personHeight.put("b", 5.6);
        personHeight.put("c", 5.9);

        personHeight.remove("c");

        System.out.println("updated height map:");
        for (Map.Entry<String, Double> entry : personHeight.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
