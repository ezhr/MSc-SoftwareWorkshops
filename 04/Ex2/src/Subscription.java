/**
 * The subscription.java class is a class that describes the subscription to a journal. It contains 3 field variables, namely title, email as well as cost.
 * It is meant to act as a superclass from which SubscriptionPrime.java will be extended.
 * @author Izhaar Dharsee IMD961
 * @version 05/11/2019
 */

public class Subscription implements SubscriptionInterface {

    /**
     * The 3 variables of the Subscription class.
     * String title is the title of the subscription
     * String email is the email of the subscriber
     * int cost is the cost of subscription
     */
    private String title;
    private String email;
    private int cost;

    /**
     * The constructor for the Subscription class. Generates a new Subscription object
     * @param title The title of the subscription; String
     * @param email The email of the subscriber; String
     * @param cost The cost of the subscription; int
     */
    public Subscription(String title, String email, int cost) {
        this.title = title;
        this.email = email;
        this.cost = cost;
    }

    /**
     * The getter method that returns the title of the subscription
     * @return title of the subscription
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * The getter method that returns the email address of the subscriber
     * @return email of the subscriber
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * The getter method that returns the cost of the subscription
     * @return cost of the subscription
     */
    @Override
    public int getCost() {
        return cost;
    }
}
