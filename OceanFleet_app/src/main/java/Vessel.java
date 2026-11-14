
/**
 * UC1: Create Vessel Model
 *
 * Goal:
 * Define a basic data model to represent a vessel and its
 * performance attributes.
 *
 * Actor:
 * Developer
 *
 * Flow:
 * 1. Developer creates a Vessel class.
 * 2. Define attributes to store vessel details.
 * 3. Provide constructors and getter/setter methods.
 *
 * Key Concepts Used:
 * - Class and Object
 * - Encapsulation
 * - Instance Variables
 * - Constructors
 * - Getter and Setter Methods
 * - JavaBeans Convention
 *
 * Key Requirements:
 * - Create a class named Vessel.
 * - Define the following attributes:
 *      String vesselId
 *      String vesselName
 *      double averageSpeed
 *      String vesselType
 * - Provide a no-argument constructor.
 * - Provide a parameterized constructor.
 * - Provide getter and setter methods.
 */

public class Vessel {

    // Instance variables (private for encapsulation)
    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    /**
     * No-argument constructor.
     * Initializes a Vessel object with default values.
     */
    public Vessel() {
    }

    /**
     * Parameterized constructor.
     * Initializes a Vessel object with the given values.
     */
    public Vessel(String vesselId, String vesselName,
                  double averageSpeed, String vesselType) {

        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    // Getter for vesselId
    public String getVesselId() {
        return vesselId;
    }

    // Setter for vesselId
    public void setVesselId(String vesselId) {
        this.vesselId = vesselId;
    }

    // Getter for vesselName
    public String getVesselName() {
        return vesselName;
    }

    // Setter for vesselName
    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    // Getter for averageSpeed
    public double getAverageSpeed() {
        return averageSpeed;
    }

    // Setter for averageSpeed
    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    // Getter for vesselType
    public String getVesselType() {
        return vesselType;
    }

    // Setter for vesselType
    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }
}
