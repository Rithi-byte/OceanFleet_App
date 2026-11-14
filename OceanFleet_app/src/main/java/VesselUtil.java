import java.util.ArrayList;
import java.util.List;

/**
 * UC2, UC3, UC4 and UC6: Vessel Utility
 *
 * Centralizes all vessel-related operations.
 *
 * Responsibilities:
 * 1. Store vessel records.
 * 2. Retrieve a vessel using its ID.
 * 3. Identify high-performance vessels.
 *
 * OOPS Principles:
 * Encapsulation - The vessel list is private.
 * Abstraction - Operations are exposed through public methods.
 * Reusability - Methods can be used by different UI components.
 */
public class VesselUtil {

    // Private list to store vessel objects
    private List<Vessel> vesselList;

    // Initialize the list
    public VesselUtil() {
        vesselList = new ArrayList<>();
    }

    // UC2: Add vessel performance record
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // UC3: Retrieve vessel using vessel ID
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {

            if (vesselId != null &&
                    vesselId.equals(vessel.getVesselId())) {

                return vessel;
            }
        }

        // Return null if vessel ID is not found
        return null;
    }

    // UC4: Identify vessels with maximum average speed
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> highPerformanceVessels = new ArrayList<>();

        // Handle empty vessel list
        if (vesselList.isEmpty()) {
            return highPerformanceVessels;
        }

        // Find the maximum average speed
        double maxSpeed = vesselList.get(0).getAverageSpeed();

        for (Vessel vessel : vesselList) {

            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Collect all vessels having the maximum speed
        for (Vessel vessel : vesselList) {

            if (Double.compare(vessel.getAverageSpeed(), maxSpeed) == 0) {
                highPerformanceVessels.add(vessel);
            }
        }

        return highPerformanceVessels;
    }
}