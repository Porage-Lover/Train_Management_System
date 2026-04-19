import java.util.Arrays;

/**
 * ==================================================================
 * MAIN CLASS - UseCase19TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using the Binary Search algorithm on sorted data.
 *
 * At this stage, the application:
 * - Creates sorted bogie ID array
 * - Defines search key
 * - Applies binary search logic
 * - Narrows search range each iteration
 * - Displays result
 *
 * This maps optimized searching logic using divide-and-conquer.
 *
 * @author Developer
 * @version 19.0
 */
public class UC19 {

    /**
     * Performs a binary search to find a specific bogie ID in an array.
     * Sorts the array first to ensure the precondition is met.
     * * @param bogieIds Array of available bogie IDs.
     * @param key The bogie ID to search for.
     * @return true if the ID is found, false otherwise.
     */
    public static boolean binarySearch(String[] bogieIds, String key) {
        if (bogieIds == null || bogieIds.length == 0) {
            return false;
        }

        // Ensure data is sorted before binary search (precondition)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Match found
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return false; // Match not found
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=========================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        
        // Ensure data is sorted before binary search
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display available bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
        System.out.println();

        // BINARY SEARCH LOGIC
        boolean found = binarySearch(bogieIds, key);

        // Display result
        if (found) {
            System.out.println("Bogie " + key + " found using Binary Search.");
        } else {
            System.out.println("Bogie " + key + " not found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}