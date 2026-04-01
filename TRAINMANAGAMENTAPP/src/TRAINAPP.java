import java.util.ArrayList;

public class TRAINAPP {
    public static void main(String[] args) {

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // ---------------- ADD OPERATION ----------------
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println(passengerBogies);

        // ---------------- REMOVE OPERATION ----------------
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(passengerBogies);

        // ---------------- CHECK EXISTENCE ----------------
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist.");
        }

        // ---------------- FINAL STATE ----------------
        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);
    }
}