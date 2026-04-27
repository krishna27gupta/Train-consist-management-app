package main;

import java.util.HashMap;
import java.util.Map;

public class UseCase6BogieCapacityMap {

    private HashMap<String, Integer> bogieMap;

    public UseCase6BogieCapacityMap() {
        bogieMap = new HashMap<>();
    }

    // Add bogie with capacity
    public void addBogie(String name, int capacity) {
        bogieMap.put(name, capacity);
    }

    // Display all bogies
    public void displayBogies() {
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    ", Capacity: " + entry.getValue());
        }
    }

    // Get capacity of a specific bogie
    public int getCapacity(String name) {
        return bogieMap.getOrDefault(name, 0);
    }

    // Get total bogies count
    public int getTotalBogies() {
        return bogieMap.size();
    }
}