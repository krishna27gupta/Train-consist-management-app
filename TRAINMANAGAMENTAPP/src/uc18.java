import java.util.Scanner;

public class UC18_LinearSearchBogieID {

    public static void main(String[] args) {

        // Step 1: Array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        Scanner sc = new Scanner(System.in);

        // Step 2: Input search key
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Linear search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // early termination
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID FOUND in the system.");
        } else {
            System.out.println("Bogie ID NOT FOUND.");
        }

        sc.close();
    }
}