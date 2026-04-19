import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * ==================================================================
 * MAIN CLASS - UseCase11TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 11: Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Developer
 * @version 11.0
 */
public class UC11 {

    // DEFINE REGEX RULES
    // TRN- followed by exactly 4 digits
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    
    // PET- followed by exactly 2 uppercase letters
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    /**
     * Validates if the Train ID strictly matches the TRN-1234 format.
     */
    public static boolean validateTrainId(String trainId) {
        if (trainId == null) return false;
        return Pattern.matches(TRAIN_ID_REGEX, trainId);
    }

    /**
     * Validates if the Cargo Code strictly matches the PET-AB format.
     */
    public static boolean validateCargoCode(String cargoCode) {
        if (cargoCode == null) return false;
        return Pattern.matches(CARGO_CODE_REGEX, cargoCode);
    }

    public static void main(String[] args) {
        
        System.out.println("=========================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("=========================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Validation Display
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + validateTrainId(trainId));
        System.out.println("Cargo Code Valid: " + validateCargoCode(cargoCode));

        System.out.println("\nUC11 validation completed...");
        scanner.close();
    }
}