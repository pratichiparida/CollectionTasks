package src.api.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList {
    public static void main(String[] args) {
        List<Integer> x = Arrays.asList(1, 2, 3);
        List<Integer> y = Arrays.asList(3, 4, 5);

        List<Integer> Common = new ArrayList<>(x);
        Common.retainAll(y);
        System.out.println("Common->"+Common);

        List<Integer> JoinedList = new ArrayList<>(x);
        JoinedList.addAll(y);
        System.out.println("Join->"+JoinedList);

        List<Integer> ClonedList = new ArrayList<>(JoinedList);
        System.out.println("Clone->" +ClonedList);
    }
}
