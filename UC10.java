import java.util.ArrayList;
import java.util.List;

/**
 * ==================================================================
 * MAIN CLASS - UseCase10TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 10: Count Total Seats in Train
 *
 * Description:
 * This class aggregates seating capacity of all bogies
 * into a single total using Stream reduce().
 *
 * At this stage, the application:
 * - Creates bogie list
 * - Maps bogies to capacity
 * - Reduces values into total
 * - Displays total seat count
 *
 * This maps aggregation logic using reduce().
 *
 * @author Developer
 * @version 10.0
 */
public class UC10 {

    // Reusing Bogie model
    public static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    /**
     * Calculates total capacity using Stream map() and reduce().
     * Logic extracted for clean unit testing.
     */
    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                // map() extracts capacity field from Bogie object
                .map(b -> b.capacity)
                // reduce() sums up the capacities starting from an identity value of 0
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("=========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        System.out.println();

        // ---- AGGREGATE USING REDUCE ----
        int totalCapacity = calculateTotalCapacity(bogies);

        System.out.println("Total Seating Capacity of Train: " + totalCapacity + "\n");
        System.out.println("UC10 aggregation completed...");
    }
}