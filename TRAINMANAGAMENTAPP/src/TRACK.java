import java.util.HashSet;
import java.util.Set;

public class TRACK {
    public static void main(String[] args) {

        // Create a HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // ---------------- ADD BOGIE IDS ----------------
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");

        // Intentional duplicates
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        System.out.println("Bogie IDs after adding (duplicates ignored automatically):");
        System.out.println(bogieIDs);

        // ---------------- CHECK EXISTENCE ----------------
        if (bogieIDs.contains("BG101")) {
            System.out.println("\nBogie BG101 exists in the train.");
        } else {
            System.out.println("\nBogie BG101 does NOT exist.");
        }

        // ---------------- FINAL STATE ----------------
        System.out.println("\nFinal Set of Unique Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }
    }
}