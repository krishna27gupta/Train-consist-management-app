import java.util.*;

// ---------------------- ABSTRACT CLASS ----------------------
abstract class Bogie {
    protected String id;
    protected String type;

    public Bogie(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public abstract void displayDetails();
}

// ---------------------- PASSENGER BOGIE ----------------------
class PassengerBogie extends Bogie {
    private int capacity;

    public PassengerBogie(String id, String type, int capacity) {
        super(id, type);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Passenger | ID: " + id +
                " | Type: " + type +
                " | Capacity: " + capacity);
    }
}

// ---------------------- GOODS BOGIE ----------------------
class GoodsBogie extends Bogie {
    private String cargoType;

    public GoodsBogie(String id, String type, String cargoType) {
        super(id, type);
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Goods | ID: " + id +
                " | Shape: " + type +
                " | Cargo: " + cargoType);
    }
}

// ---------------------- TRAIN CLASS ----------------------
class Train {
    private String trainName;
    private LinkedList<Bogie> bogies;
    private HashSet<String> bogieIds;

    public Train(String trainName) {
        this.trainName = trainName;
        this.bogies = new LinkedList<>();
        this.bogieIds = new HashSet<>();
    }

    public void addBogie(Bogie bogie) {
        if (bogieIds.contains(bogie.getId())) {
            System.out.println("❌ Duplicate Bogie ID not allowed: " + bogie.getId());
            return;
        }
        bogies.add(bogie);
        bogieIds.add(bogie.getId());
    }

    public void removeBogie(String id) {
        Iterator<Bogie> it = bogies.iterator();
        while (it.hasNext()) {
            Bogie b = it.next();
            if (b.getId().equals(id)) {
                it.remove();
                bogieIds.remove(id);
                System.out.println("✅ Bogie removed: " + id);
                return;
            }
        }
        System.out.println("❌ Bogie not found: " + id);
    }

    public void displayConsist() {
        System.out.println("\n🚆 Train: " + trainName);
        System.out.println("Total Bogies: " + bogies.size());
        System.out.println("----- Consist Details -----");

        for (Bogie b : bogies) {
            b.displayDetails();
        }
    }

    public void displayTotalCapacity() {
        int total = 0;
        for (Bogie b : bogies) {
            if (b instanceof PassengerBogie) {
                total += ((PassengerBogie) b).getCapacity();
            }
        }
        System.out.println("👥 Total Passenger Capacity: " + total);
    }

    public void displayCargoSummary() {
        Set<String> cargoSet = new HashSet<>();
        for (Bogie b : bogies) {
            if (b instanceof GoodsBogie) {
                cargoSet.add(((GoodsBogie) b).getCargoType());
            }
        }
        System.out.println("📦 Cargo Types: " + cargoSet);
    }

    public void reverseConsist() {
        Collections.reverse(bogies);
        System.out.println("🔄 Train consist reversed.");
    }
}

// ---------------------- MAIN CLASS ----------------------
public class TRAINAPP {
    public static void main(String[] args) {

        Train train = new Train("Express Line");

        // Passenger bogies
        train.addBogie(new PassengerBogie("P1", "Sleeper", 72));
        train.addBogie(new PassengerBogie("P2", "AC Chair", 60));
        train.addBogie(new PassengerBogie("P3", "First Class", 40));

        // Goods bogies
        train.addBogie(new GoodsBogie("G1", "Rectangular", "Coal"));
        train.addBogie(new GoodsBogie("G2", "Cylindrical", "Oil"));

        // Duplicate test
        train.addBogie(new PassengerBogie("P1", "Sleeper", 72));

        // Display
        train.displayConsist();

        // Capacity
        train.displayTotalCapacity();

        // Cargo
        train.displayCargoSummary();

        // Remove test
        train.removeBogie("P2");

        // Reverse
        train.reverseConsist();

        // Final display
        train.displayConsist();
    }
}