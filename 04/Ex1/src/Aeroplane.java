/**
 * The Aeroplane class is a subclass of the Aircraft.class class. It extends the functionality of the Aircraft class by adding an additional parameter of type float: fuelConsumption
 * @author Izhaar Dharsee IMD961
 * @version 05/11/2019
 */

public class Aeroplane extends Aircraft {
    private double fuelConsumption;

    /**
     * The constructor for a new Aeroplane object. Inherits from the superclass and sets the value of all variables including fuelConsumption
     * @param passengerNumber The passenger number; integer
     * @param maxSpeed The maximum speed of the aircraft; integer
     * @param fuelConsumption The fuel consumption of the aeroplane
     */
    public Aeroplane(int passengerNumber, int maxSpeed, double fuelConsumption) {
        super(passengerNumber, maxSpeed);
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Getter method that returns the fuel consumption of the aircraft
     * @return fuelConsumption of the aircraft
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Setter method to set the new fuel consumption of the aircraft
     * @param fuelConsumption New fuelConsumption of the Aeroplane
     */
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * The toString method returns the information about a particular aeroplane in a human readable format
     * @return Readable format of the aeroplane object
     */
    @Override
    public String toString() {
        return super.toString() + "\nFuel Consumption: " + fuelConsumption;
    }
}
