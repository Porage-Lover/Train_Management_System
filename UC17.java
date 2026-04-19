import java.util.Arrays;

/**
 * ==================================================================
 * MAIN CLASS - UseCase17TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java's built-in Arrays.sort() method.
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for sorting
 * - Displays sorted results
 *
 * This maps optimized sorting using Java Library utilities.
 *
 * @author Developer
 * @version 17.0
 */
public class UC17 {

    /**
     * Sorts an array of bogie names alphabetically using Arrays.sort().
     * Logic extracted for clean unit testing.
     */
    public static void sortBogieNames(String[] bogieNames) {
        // Arrays.sort() - A built-in Java utility method that sorts arrays using
        // optimized algorithms (like dual-pivot quicksort).
        Arrays.sort(bogieNames);
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("=========================================\n");

        // Create an array of bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original order
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames) + "\n");

        // Sort the array using the extracted method
        sortBogieNames(bogieNames);

        // Display sorted results
        System.out.println("Sorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames) + "\n");

        System.out.println("UC17 sorting completed...");
    }
}