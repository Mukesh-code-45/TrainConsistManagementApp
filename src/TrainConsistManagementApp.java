import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Built-in sorting
        Arrays.sort(bogieNames);

        System.out.println("After Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}