public class UC16_BubbleSortCapacity {

    public static void main(String[] args) {

        // Step 1: Passenger bogie capacities
        int[] capacities = {50, 20, 80, 10, 60};

        // Step 2: Bubble Sort Logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 3: Display sorted result
        System.out.print("Sorted Passenger Capacities: ");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }

        System.out.println();
    }
}