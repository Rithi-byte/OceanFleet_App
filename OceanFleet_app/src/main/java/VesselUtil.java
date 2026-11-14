import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Store Vessel Records Using List
 *
 * Goal:
 * Store multiple vessel records efficiently in memory.
 *
 * Actor:
 * User
 *
 * Flow:
 * 1. User enters vessel details.
 * 2. Program creates Vessel objects.
 * 3. Objects are added to a collection.
 *
 * Key Concepts Used:
 * - Java Collections Framework
 * - List<Vessel>
 * - Dynamic data storage
 * - Object references
 *
 * Key Requirements:
 * - Create VesselUtil class.
 * - Maintain private List<Vessel> vesselList.
 * - Implement addVesselPerformance(Vessel vessel).
 *
 * Why List?
 * - Maintains insertion order.
 * - Supports dynamic resizing.
 * - Ideal for sequential traversal.
 *
 *
 * UC3: Retrieve Vessel by Vessel ID
 *
 * Goal:
 * Fetch a specific vessel's details using its unique ID.
 *
 * Actor:
 * User
 *
 * Flow:
 * 1. User provides a vesselId.
 * 2. Program searches the list.
 * 3. If found, vessel details are displayed.
 * 4. If not found, a message is shown.
 *
 * Key Concepts Used:
 * - Linear search
 * - Iteration over List
 * - Conditional logic
 * - Null handling
 *
 * Key Requirements:
 * - Implement:
 *   public Vessel getVesselById(String vesselId)
 * - Vessel ID comparison is case-sensitive.
 * - Return null if not found.
 *
 *
 * UC4: Identify High-Performance Vessels
 *
 * Goal:
 * Find vessels with the highest average speed.
 *
 * Actor:
 * User
 *
 * Flow:
 * 1. Program scans all vessel records.
 * 2. Determines the maximum speed.
 * 3. Collects all vessels matching that speed.
 * 4. Displays high-performance vessels.
 *
 * Key Concepts Used:
 * - List traversal
 * - Maximum value identification
 * - Conditional filtering
 * - Multiple object results
 *
 * Key Requirements:
 * - Implement:
 *   public List<Vessel> getHighPerformanceVessels()
 * - Return one vessel if there is a unique maximum.
 * - Return multiple vessels if there is a tie.
 */
public class VesselUtil {

    // Stores multiple Vessel object references
    private List<Vessel> vesselList;

    // Constructor initializes the collection
    public VesselUtil() {
        vesselList = new ArrayList<>();
    }

    /**
     * Adds a Vessel object to the vessel list.
     *
     * @param vessel Vessel object to be added
     */
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    /**
     * Retrieves a vessel using its unique vessel ID.
     *
     * @param vesselId ID of the vessel to search
     * @return Matching Vessel object if found, otherwise null
     */
    public Vessel getVesselById(String vesselId) {

        // Iterate through every vessel in the list
        for (Vessel vessel : vesselList) {

            // Compare vessel IDs (case-sensitive)
            if (vessel.getVesselId().equals(vesselId)) {

                // Return the matching Vessel object
                return vessel;
            }
        }

        // Return null if no matching vessel is found
        return null;
    }

    /**
     * Identifies all vessels having the highest average speed.
     *
     * @return List of vessels with the maximum average speed.
     *         Returns an empty list if no vessels are available.
     */
    public List<Vessel> getHighPerformanceVessels() {

        // Stores all vessels having the maximum average speed
        List<Vessel> highPerformanceVessels = new ArrayList<>();

        // Check whether the vessel list is empty
        if (vesselList.isEmpty()) {
            return highPerformanceVessels;
        }

        // Initialize maximum speed using the first vessel
        double maxSpeed = vesselList.get(0).getAverageSpeed();

        // First traversal: Find the maximum average speed
        for (Vessel vessel : vesselList) {

            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Second traversal: Collect all vessels matching maximum speed
        for (Vessel vessel : vesselList) {

            if (Double.compare(vessel.getAverageSpeed(), maxSpeed) == 0) {
                highPerformanceVessels.add(vessel);
            }
        }

        // Return all high-performance vessels
        return highPerformanceVessels;
    }
}
