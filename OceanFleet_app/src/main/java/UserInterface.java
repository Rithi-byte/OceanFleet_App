
import java.util.List;
import java.util.Scanner;

/**
 * UC5: Integrate User Interaction (Console App)
 *
 * Goal:
 * Allow user-driven execution through console input.
 *
 * Actor: User
 *
 * Requirements:
 * 1. Accept the number of vessels.
 * 2. Accept vessel details in the format:
 *    vesselId:vesselName:averageSpeed:vesselType
 * 3. Parse the input using split(":").
 * 4. Create Vessel objects and store them using VesselUtil.
 * 5. Retrieve a vessel using its ID.
 * 6. Display all high-performance vessels.
 *
 * Key Concepts:
 * - Console I/O
 * - String parsing
 * - Object creation
 * - Delegation to utility class
 */

public class UserInterface {

    public static void main(String[] args) {

        // Scanner is used to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Create an object of VesselUtil to perform vessel operations
        VesselUtil vesselUtil = new VesselUtil();

        // Accept the number of vessels from the user
        System.out.println("Enter the number of vessels:");
        int numberOfVessels = Integer.parseInt(scanner.nextLine());

        // Read details of each vessel
        for (int i = 0; i < numberOfVessels; i++) {

            System.out.println(
                    "Enter vessel details (vesselId:vesselName:averageSpeed:vesselType):"
            );

            // Read the complete vessel details as a String
            String input = scanner.nextLine();

            // Split the input using colon as the delimiter
            String[] details = input.split(":");

            // Extract individual vessel attributes
            String vesselId = details[0];
            String vesselName = details[1];
            double averageSpeed = Double.parseDouble(details[2]);
            String vesselType = details[3];

            // Create a Vessel object using the extracted attributes
            Vessel vessel = new Vessel(
                    vesselId,
                    vesselName,
                    averageSpeed,
                    vesselType
            );

            // Delegate the storage operation to VesselUtil
            vesselUtil.addVesselPerformance(vessel);
        }

        // Accept the vessel ID that the user wants to search
        System.out.println("Enter vessel ID to search:");
        String searchId = scanner.nextLine();

        // Delegate the search operation to VesselUtil
        Vessel searchedVessel = vesselUtil.getVesselById(searchId);

        // Display the retrieved vessel details
        if (searchedVessel != null) {

            System.out.println("Vessel Found:");

            System.out.println(
                    searchedVessel.getVesselId() + " | " +
                            searchedVessel.getVesselName() + " | " +
                            searchedVessel.getVesselType() + " | " +
                            searchedVessel.getAverageSpeed() + " knots"
            );

        } else {

            // Display a message if the vessel ID does not exist
            System.out.println("Vessel Id " + searchId + " not found.");
        }

        // Retrieve all vessels having the maximum average speed
        System.out.println("High Performance Vessels:");

        List<Vessel> highPerformanceVessels =
                vesselUtil.getHighPerformanceVessels();

        // Display the high-performance vessel details
        for (Vessel vessel : highPerformanceVessels) {

            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        }

        // Close the Scanner
        scanner.close();
    }
}
