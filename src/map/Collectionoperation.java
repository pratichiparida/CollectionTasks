package src.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collectionoperation {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        int searchKey = 2;
        String searchValue = "three";
        System.out.println(searchKey+"exists:"+map.containsKey(searchKey));
        System.out.println(searchValue+"'exists:"+map.containsValue(searchValue));

        System.out.println("keyvalue Pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"->"+ entry.getValue());
        }

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("sorted map:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        map.clear();
        System.out.println("after deletion:" + map);
    }
}
