import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==================================================================
 * MAIN CLASS - UseCase13TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * This class compares execution time of loop-based filtering
 * versus stream-based filtering using System.nanoTime().
 *
 * At this stage, the application:
 * - Creates bogie test dataset
 * - Measures loop execution time
 * - Measures stream execution time
 * - Calculates elapsed duration
 * - Displays performance results
 *
 * This maps performance benchmarking using high-resolution timing.
 *
 * @author Developer
 * @version 13.0
 */
public class UC13 {

    // Bogie model
    public static class Bogie {
        String type;
        int capacity;

        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    /**
     * Filters bogies with capacity > 60 using a traditional for-loop.
     */
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> filteredList = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                filteredList.add(b);
            }
        }
        return filteredList;
    }

    /**
     * Filters bogies with capacity > 60 using the Stream API.
     */
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("==================================================\n");

        // Create large test dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            // Alternate capacities to simulate mixed dataset
            bogies.add(new Bogie("Sleeper", (i % 2 == 0) ? 72 : 56));
        }

        // --- Measure Loop Execution Time ---
        long startLoopTime = System.nanoTime();
        filterUsingLoop(bogies);
        long endLoopTime = System.nanoTime();
        long loopExecutionTime = endLoopTime - startLoopTime;

        // --- Measure Stream Execution Time ---
        long startStreamTime = System.nanoTime();
        filterUsingStream(bogies);
        long endStreamTime = System.nanoTime();
        long streamExecutionTime = endStreamTime - startStreamTime;

        // Display results
        System.out.println("Loop Execution Time (ns): " + loopExecutionTime);
        System.out.println("Stream Execution Time (ns): " + streamExecutionTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}