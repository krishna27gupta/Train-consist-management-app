import java.util.LinkedList;

public class TRACK {
    public static void main(String[] args) {

        // ---------------- CREATE LINKEDLIST ----------------
        LinkedList<String> trainConsist = new LinkedList<>();

        // ---------------- ADD BOGIES ----------------
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ---------------- INSERT AT SPECIFIC POSITION ----------------
        // Insert Pantry Car at position 2 (index starts from 0)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car at Position 2:");
        System.out.println(trainConsist);

        // ---------------- REMOVE FIRST AND LAST ----------------
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        // ---------------- FINAL ORDERED CONSIST ----------------
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}