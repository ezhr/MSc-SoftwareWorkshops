/**
 * The SubscriptionPrime.java class is a class that extends the Subscription.java class. In addition to the variables of its superclass, it adds an address field for physical delivery
 * @author Izhaar Dharsee IMD961
 * @version 05/11/2019
 */

public class SubscriptionPrime extends Subscription implements SubscriptionPrimeInterface {
    private String address;

    /**
     * The constructor for the SubscriptionPrime class. Generates a new SubscriptionPrime object with all variables including address
     *
     * @param title The title of the subscription; String
     * @param email The email of the subscriber; String
     * @param cost  The cost of the subscription; int
     * @param address The address of the subscriber; String
     */
    public SubscriptionPrime(String title, String email, int cost, String address) {
        super(title, email, cost);
        this.address = address;
    }

    /**
     * The getter method that returns the address of the subscriber
     * @return address of the subscriber
     */
    @Override
    public String getAddress() {
        return address;
    }
}
