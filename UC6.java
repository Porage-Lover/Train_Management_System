import java.util.HashMap;
import java.util.Map;

/**
 * ==================================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure. [cite: 110]
 *
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping [cite: 111]
 * - Inserts capacity values for each bogie [cite: 111]
 * - Iterates through map entries [cite: 111]
 * - Displays bogie and capacity information [cite: 111]
 *
 * This maps lookup-based access using HashMap. [cite: 111]
 *
 * @author Developer [cite: 112]
 * @version 6.0 [cite: 112]
 */
public class UC6 {

    public static void main(String[] args) {
        
        System.out.println("=========================================");
        System.out.println("  UC6 - Map Bogie to Capacity (HashMap)  ");
        System.out.println("=========================================\n");

        // HashMap stores data in key-value format [cite: 113]
        Map<String, Integer> capacityMap = new HashMap<>();

        // Insert bogie capacities [cite: 113]
        // Use the put() method to map each bogie to its capacity [cite: 124]
        capacityMap.put("First Class", 24); 
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:");
        
        // Iterate over the map using entrySet() [cite: 124]
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            // Display each bogie along with its corresponding capacity [cite: 125]
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}