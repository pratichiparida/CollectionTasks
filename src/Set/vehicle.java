package src.Set;

import java.util.HashSet;
import java.util.Set;

public class vehicle {
    public static void findvehicle() {
        Set<String> vehicles = new HashSet<>();

        vehicles.add("car");
        vehicles.add("cycle");
        vehicles.add("bike");
        vehicles.add("bus");
        vehicles.add("train");

        System.out.println("Available vehicles:");
        System.out.println(vehicles);

        vehicles.remove("bike");
        System.out.println("removing 'bike':");
        System.out.println(vehicles);

        String checkVehicle = "truck";
        if (vehicles.contains(checkVehicle)) {
            System.out.println( checkVehicle + " exists");
        } else {
            System.out.println(checkVehicle + " does not exist");
        }
    }
    public static void main(String[] args) {
        findvehicle();
    }
}
