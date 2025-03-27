package src.api.task1;

import java.util.*;

public class ConvertlistSet {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Set<Integer> setviaList = new HashSet<>(list);
        List<Integer> listviaSet = new ArrayList<>(setviaList);
        System.out.println(setviaList);
        System.out.println(listviaSet);
    }
}
