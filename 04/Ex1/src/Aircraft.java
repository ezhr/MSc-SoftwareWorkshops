/**
 * The Aircraft.java file is a class that stores certain information about an aircraft; namely its passenger number and its maximum speed.
 * It contains a standard constructor as well as getters and setters for its two variables.
 * It is a superclass that can be extended by subclasses to enhance functionality.
 * @author Izhaar Dharsee IMD961
 * @version 05/11/2019
 */

public class Aircraft {

    private int passengerNumber;
    private int maxSpeed;

    /**
     * The constructor for the aircraft class to create a new object of the aircraft class
     * @param passengerNumber The passenger number; integer
     * @param maxSpeed The maximum speed of the aircraft; integer
     */
    public Aircraft(int passengerNumber, int maxSpeed) {
        this.passengerNumber = passengerNumber;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Getter method that returns the passenger number of the aircraft
     * @return passengerNumber of the aircraft
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * Setter method to set the new passenger number of the aircraft
     * @param passengerNumber New passengerNumber of the aircraft
     */
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    /**
     * Getter method that returns the maximum speed of the aircraft
     * @return maxSpeed of the aircraft
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Setter method to set the new maximum speed of the aircraft
     * @param maxSpeed New maxSpeed of the aircraft
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * The toString method returns the information about a particular aircraft in a human readable format
     * @return Readable format of the aircraft object
     */
    @Override
    public String toString() {
        return "Passenger Number: " + passengerNumber + "\nMaximum Speed: " + maxSpeed;
    }
}
