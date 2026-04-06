import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ==================================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * This maps ordered uniqueness using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */
public class UC5 {

    public static void main(String[] args) {
        
        System.out.println("=========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=========================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Attach bogies such as: Engine, Sleeper, Cargo, Guard.
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempt to attach a duplicate bogie intentionally (for example, Sleeper again).
        formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(formation + "\n");
        
        System.out.println("Note:\nLinkedHashSet preserves insertion order and removes duplicates automatically.\n");
        
        System.out.println("UC5 formation setup completed...");
    }
}