/**
 * UC1 and UC6: Vessel Model
 *
 * Represents a vessel and stores its details.
 *
 * OOPS Principles:
 * Encapsulation - All instance variables are private.
 * Abstraction - Public getters and setters provide controlled access.
 */
public class Vessel {

    // Private fields to achieve encapsulation
    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    // Default constructor
    public Vessel() {
    }

    // Parameterized constructor
    public Vessel(String vesselId, String vesselName,
                  double averageSpeed, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    // Getter and setter methods
    public String getVesselId() {
        return vesselId;
    }

    public void setVesselId(String vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }
}