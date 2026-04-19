/**
 * ==================================================================
 * MAIN CLASS - UseCase18TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using a simple Linear Search algorithm.
 *
 * At this stage, the application:
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverses array sequentially
 * - Stops when match is found
 * - Displays search result
 *
 * This maps basic searching logic using sequential traversal.
 *
 * @author Developer
 * @version 18.0
 */
public class UC18 {

    /**
     * Performs a linear search to find a specific bogie ID in an array.
     * Logic extracted for clean unit testing.
     * * @param bogieIds Array of available bogie IDs.
     * @param searchId The bogie ID to search for.
     * @return true if the ID is found, false otherwise.
     */
    public static boolean linearSearch(String[] bogieIds, String searchId) {
        // Traverse each element sequentially
        for (String id : bogieIds) {
            // Compare each ID safely using equals()
            if (id.equals(searchId)) {
                // Early Termination: Stop searching immediately once a match is found
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=========================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        
        // Bogie ID to search
        String searchId = "BG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
        System.out.println();

        // LINEAR SEARCH LOGIC
        boolean found = linearSearch(bogieIds, searchId);

        // Display result
        if (found) {
            System.out.println("Bogie " + searchId + " found in train consist.");
        } else {
            System.out.println("Bogie " + searchId + " not found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}