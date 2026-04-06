import java.util.LinkedList;

/**
 * ==================================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations. [cite: 66]
 *
 * At this stage, the application:
 * - Adds bogies in sequence [cite: 66]
 * - Inserts bogies at specific positions [cite: 66]
 * - Removes bogies from front and rear [cite: 66]
 * - Displays updated train structure [cite: 66]
 *
 * This maps positional operations using LinkedList. [cite: 66]
 *
 * @author Developer [cite: 67]
 * @version 4.0 [cite: 67]
 */
public class UC4 {

    public static void main(String[] args) {
        
        System.out.println("=========================================");
        System.out.println("   UC4 Maintain Ordered Bogie Consist    ");
        System.out.println("=========================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order and allows fast inserts [cite: 67]
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies: Engine, Sleeper, AC, Cargo, Guard [cite: 74]
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:"); 
        System.out.println(trainConsist + "\n");

        // Insert a Pantry Car at position 2 [cite: 74]
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:"); 
        System.out.println(trainConsist + "\n");

        // Remove the first and last bogie [cite: 74]
        // removeFirst() / removeLast() - Detaches bogies from the head or tail. [cite: 72]
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:"); 
        System.out.println(trainConsist + "\n");
        
        System.out.println("UC4 ordered consist operations completed..."); 
    }
}