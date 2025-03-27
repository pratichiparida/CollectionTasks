package src.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MappingTask {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("bbsr", 47348593);
        cityPopulation.put("hyd", 73692);
        cityPopulation.put("blr", 37459356);

        System.out.println("City Populations: " + cityPopulation);

        TreeMap<String, Integer> treeMap = new TreeMap<>(cityPopulation);
        TreeMap<String, Integer> copiedTreeMap = new TreeMap<>(treeMap);
        System.out.println("Copied TreeMap: " + copiedTreeMap);
    }
}
