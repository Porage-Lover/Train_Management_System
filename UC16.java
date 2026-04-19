/**
 * ==================================================================
 * MAIN CLASS - UseCase16TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity
 *
 * Description:
 * This class demonstrates manual sorting of passenger
 * bogie capacities using the Bubble Sort algorithm
 * instead of built-in sorting utilities.
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when required
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort.
 *
 * @author Developer
 * @version 16.0
 */
public class UC16 {

    /**
     * Sorts an integer array in ascending order using the Bubble Sort algorithm.
     * Logic extracted for clean unit testing.
     */
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        
        // Outer Loop controls number of passes
        for (int i = 0; i < n - 1; i++) {
            
            // Inner Loop compares adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                
                // Swap if the left element is greater than the right element
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("=========================================\n");

        // Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original order
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        System.out.println();

        // BUBBLE SORT LOGIC
        bubbleSort(capacities);

        // Display sorted result
        System.out.println("\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        
        System.out.println("\n\nUC16 sorting completed...");
    }
}