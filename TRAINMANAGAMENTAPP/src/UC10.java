import java.util.ArrayList;
import java.util.List;

class Bogie {
    int capacity;

    Bogie(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class UC10_SeatingCapacityAggregation {

    public static void main(String[] args) {

        // Step 1: User creates a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(50));
        bogies.add(new Bogie(60));
        bogies.add(new Bogie(55));
        bogies.add(new Bogie(45));

        // Step 2-4: Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity values
                .reduce(0, Integer::sum);      // sum all capacities

        // Step 5: Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);

        // Program continues...
    }
}