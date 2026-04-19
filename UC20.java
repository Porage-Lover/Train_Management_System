/**
 * ==================================================================
 * MAIN CLASS - UseCase20TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * This class prevents searching when no bogies exist
 * by applying fail-fast validation using exceptions.
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search operation
 * - Displays meaningful message
 *
 * This maps defensive programming using runtime exceptions.
 *
 * @author Developer
 * @version 20.0
 */
public class UC20 {

    /**
     * Searches for a bogie ID, but enforces fail-fast validation first.
     * Throws an IllegalStateException if the array is empty.
     */
    public static boolean searchBogie(String[] bogieIds, String searchId) {
        
        // FAIL-FAST VALIDATION
        // Check if train has bogies before performing search
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // SEARCH LOGIC (executes only if data exists)
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("=========================================\n");

        // Create bogie array (empty train scenario)
        String[] bogieIds = {};
        
        // Search key
        String searchId = "BG101";

        // The method will throw an exception here, crashing the program intentionally
        // to demonstrate the fail-fast principle.
        boolean found = searchBogie(bogieIds, searchId);

        // Display result (will not execute due to exception)
        if (found) {
            System.out.println("Bogie " + searchId + " found.");
        } else {
            System.out.println("Bogie " + searchId + " not found.");
        }

        System.out.println("\nUC20 execution completed...");
    }
}