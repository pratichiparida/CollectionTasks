package src.api.task1;

import java.util.*;

class Trimarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.trimToSize();
        System.out.println(list);
    }
}