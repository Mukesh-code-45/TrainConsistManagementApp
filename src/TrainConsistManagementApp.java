import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add Bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion (READ)
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (DELETE)
        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence (SEARCH)
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Final state
        System.out.println("Final Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}