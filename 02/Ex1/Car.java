/**
 * Car is a simple class for listing the information about a car. It stores the make, the price, the maximum speed, as well as the colour of the car.
 *
 * @author Izhaar Dharsee
 * @version 2019-10-08
 */

public class Car {

    private String make;
    private int price;
    private int maxSpeed;
    private String colour;

    /**
     * The constructor for a Car object
     *
     * @param make     The make of the car: String
     * @param price    The price of the car: int
     * @param maxSpeed The maximum speed of the car: int
     * @param colour   The colour of the car: String
     */
    public Car(String make, int price, int maxSpeed, String colour) {
        this.make = make;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    /**
     * Getter method for the make of the car.
     *
     * @return make
     */
    public String getMake() {
        return make;
    }

    /**
     * Getter method for the price of the car.
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Getter method for the maximum speed of the car.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Getter method for the colour of the car.
     *
     * @return colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Setter method changes the make of the car.
     *
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Setter method changes the price of the car.
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Setter method changes the maximum speed of the car.
     *
     * @param maxSpeed
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Setter method changes the colour of the car.
     *
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * This method defines how to print the details of the car.
     *
     * @return The details of the car in a String, human-readable format
     */
    public String toString() {
        return ("Make: " + this.make + " Price: " + this.price + " Maximum Speed: " + this.maxSpeed + " Colour: " + this.colour);
    }
}