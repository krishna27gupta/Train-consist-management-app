public class UC15_SafeCargoAssignment {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("CYLINDRICAL", "PETROLEUM");
        GoodsBogie b2 = new GoodsBogie("RECTANGULAR", "PETROLEUM"); // unsafe case

        try {
            b1.assignCargo();
            b2.assignCargo(); // exception will occur here

        } catch (CargoSafetyException e) {
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed (cleanup/logging done).");
        }

        System.out.println("Program continues safely...");
    }
}