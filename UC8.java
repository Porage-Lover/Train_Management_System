import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==================================================================
 * MAIN CLASS - UseCase8TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Applies filter condition
 * - Collects filtered result
 * - Displays qualifying bogies
 *
 * @author Developer
 * @version 8.0
 */
public class UC8 {

    // Reusing Bogie model from UC7
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
     * Filters bogies by capacity using Stream API.
     * Logic extracted to allow for clean unit testing.
     */
    public static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("=========================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        System.out.println();

        // Apply filter (b -> b.capacity > 60) as the condition
        List<Bogie> filteredBogies = filterBogiesByCapacity(bogies, 60);

        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}