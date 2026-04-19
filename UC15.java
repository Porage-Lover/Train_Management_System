/**
 * ==================================================================
 * MAIN CLASS - UseCase15TrainConsistMgmt
 * ==================================================================
 *
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * This class safely assigns cargo to goods bogies
 * while handling unsafe combinations using structured
 * exception handling blocks.
 *
 * At this stage, the application:
 * - Defines a custom runtime exception
 * - Validates cargo assignment rules
 * - Throws exception for unsafe cargo
 * - Catches and handles the exception
 * - Executes finally block for logging
 *
 * This maps runtime safety handling using try-catch-finally.
 *
 * @author Developer
 * @version 15.0
 */
public class UC15 {

    // ---- CUSTOM RUNTIME EXCEPTION ----
    public static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie model
    public static class GoodsBogie {
        public String shape;
        public String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        /**
         * Validates if the cargo is safe for the current bogie shape.
         * Throws CargoSafetyException if the rule is violated.
         */
        public void validateCargo(String cargo) {
            // Rule: Rectangular bogie cannot carry petroleum
            if ("Rectangular".equalsIgnoreCase(this.shape) && "Petroleum".equalsIgnoreCase(cargo)) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }
        }

        /**
         * Assigns cargo using structured exception handling.
         */
        public void assignCargo(String cargo) {
            try {
                validateCargo(cargo);
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo validation completed for " + this.shape + " bogie\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("=========================================\n");

        // Safe Assignment
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");
        cylindricalBogie.assignCargo("Petroleum");

        // Unsafe Assignment (Handled gracefully)
        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        rectangularBogie.assignCargo("Petroleum");

        System.out.println("UC15 runtime handling completed...");
    }
}