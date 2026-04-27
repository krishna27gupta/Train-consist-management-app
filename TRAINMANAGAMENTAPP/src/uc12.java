import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;   // e.g., CYLINDRICAL, BOX
    String cargo;  // e.g., PETROLEUM, COAL

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UC12_SafetyCompliance {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("CYLINDRICAL", "PETROLEUM"));
        bogies.add(new GoodsBogie("BOX", "COAL"));
        bogies.add(new GoodsBogie("BOX", "IRON"));

        // Step 2: Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    // Rule: Cylindrical bogie must carry only Petroleum
                    if (b.type.equals("CYLINDRICAL")) {
                        return b.cargo.equals("PETROLEUM");
                    }
                    return true; // other bogies are allowed
                });

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFETY COMPLIANT");
        }

        // Program continues...
    }
}