
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
}
