import java.util.Arrays;

public class UC17_SortBogieNames {

    public static void main(String[] args) {

        // Step 1: Bogie type names
        String[] bogieNames = {
                "Sleeper",
                "AC",
                "General",
                "ChairCar",
                "SecondClass"
        };

        // Step 2: Sort using built-in method
        Arrays.sort(bogieNames);

        // Step 3: Display sorted result
        System.out.println("Sorted Bogie Names: " + Arrays.toString(bogieNames));
    }
}