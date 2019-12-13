/**
 * Good is a class that stores information about an item. It contains its name and its net price and calculates gross prices and discounted prices.
 * @author Izhaar Dharsee
 * @version 2019-10-08
 */

public class Good {

    final static double VAT_RATE = 20;

    private String name;
    private double netPrice;
    private double discountRate = 0;
    private double grossPrice = 0;

    /**
     * The constructor creates a Good object and sets its name and netPrice according to the parameters passed to it by the constructor as parameters.
     * @param name The name of the good; String
     * @param netPrice The net price of the price; double
     */
    public Good(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    /**
     * The getName getter method returns the name of the good.
     * @return Name of the good; String
     */
    public String getName(){
        return name;
    }

    /**
     * The getNetPrice getter method returns the net price of the good.
     * @return Net price of the good; String
     */
    public double getNetPrice(){
        return netPrice;
    }

    /**
     * The setName setter method sets the name of the good object.
     * @param name The new name of the good
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * The setNetPrice setter method sets the net price of the good object.
     * @param netPrice The new net price of the good
     */
    public void setNetPrice(double netPrice){
        this.netPrice = netPrice;
        this.grossPrice = grossPrice();
    }

    /**
     * The toString method returns the contents of the good - i.e. the name and its calculated gross price as a string
     * @return The details of the good as a String
     */
    public String toString(){
        discount(discountRate);
        double value = this.grossPrice * 100;
        value = (double) Math.round(value);
        value /= 100; // value = value / 100;
        return "The " + name + " has a gross price of \u00A3" + String.format("%.2f", value) + ".";
    }

    /**
     * The grossPrice method calculates the gross price of the good by adding the VAT rate
     * @return The gross price of the good by adding the VAT rate
     */
    public double grossPrice(){
        return netPrice * (1.0 + (VAT_RATE/100));
    }

    /**
     * The discount method attaches a discount rate from 0-100% to the good
     * @param rate The rate of discount attached to the good as a double from 0-100, where 0 is 0% and 100% is a 100% discount
     */
    public void discount(double rate) {
        this.discountRate = rate;
        this.grossPrice = ((100 - discountRate)/100) * grossPrice();
    }
}