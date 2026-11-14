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
 * - Create a VesselUtil class.
 * - Maintain:
 *      private List<Vessel> vesselList;
 *
 * - Implement:
 *      public void addVesselPerformance(Vessel vessel)
 *
 * Why List?
 * - Maintains insertion order.
 * - Supports dynamic resizing.
 * - Ideal for sequential traversal.
 */

public class VesselUtil {

    // Stores multiple Vessel object references
    private List<Vessel> vesselList;

    /**
     * Constructor initializes the vessel list.
     */
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
}
