import java.util.LinkedHashSet;
import java.util.Set;

public class TRACK {
    public static void main(String[] args) {

        // ---------------- CREATE LINKEDHASHSET ----------------
        Set<String> trainFormation = new LinkedHashSet<>();

        // ---------------- ADD BOGIES ----------------
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add a duplicate bogie
        trainFormation.add("Sleeper");  // This will be ignored automatically

        // ---------------- DISPLAY TRAIN FORMATION ----------------
        System.out.println("Final Train Formation (Preserving Insertion Order, No Duplicates):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}