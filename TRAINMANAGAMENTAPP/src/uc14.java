public class UC14_InvalidCapacityCheck {

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie(50);
            b1.display();

            PassengerBogie b2 = new PassengerBogie(-10); // invalid case
            b2.display();

        } catch (InvalidCapacityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}