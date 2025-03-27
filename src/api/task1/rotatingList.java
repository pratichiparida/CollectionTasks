package src.api.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rotatingList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int positions = 2;
        Collections.rotate(list, -positions);
        System.out.println(list);
    }
}
