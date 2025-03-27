package src.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class yearorder {
    public static void ordering() {
        Set<String> months = new HashSet<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println("Iterating through HashSet ->Order is not preserved:");
        Iterator<String> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        ordering();
    }
}
