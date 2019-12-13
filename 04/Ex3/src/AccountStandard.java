import java.util.ArrayList;

/**
 * The AccountStandard class allows for Standard users to be created
 * for the system, giving them basic access and allows them to purchase
 * MusicTitle tracks.
 * @author Izhaar Dharsee IMD961
 * @version 10/11/2019
 */

public class AccountStandard extends Account implements AccountStandardInterface {

    public static final int MAXIMAL_LOGIN_ATTEMPTS = 3;
    private int balance;
    private ArrayList<MusicTitle> titlesBought = new ArrayList<>();
    private int failedLoginAttempts = 0;

    /**
     * Constructor for an Administrator Account, is implemented by the superclass.
     * @param name The username of the account holder; String
     * @param salutation The salutation of the account holder; String
     * @param email The email of the account holder; String
     * @param password The password of the account holder; String
     */
    public AccountStandard(String name, String salutation, String email, String password) {
        super(name, salutation, email, password);
    }

    /**
     * Getter method to return the balance.
     *
     * @return The balance of the account.
     */
    @Override
    public int getBalance() {
        return balance;
    }

    /**
     * Method for a user to log in to their account by providing a
     * password. It is first checked whether the account is still
     * active (that is, not too many failed login attempts were made
     * in the past) and secondly whether the password provided is
     * correct. In case of a correct login the number of login
     * attempts is reset to 0, else increased by 1.
     *
     * @param password The password provided for the login; this is
     *                 to be compared to the password stored on the system.
     */
    @Override
    public void login(String password) {
        if (getFailedLoginAttempts() < MAXIMAL_LOGIN_ATTEMPTS) {
            if (checkPassword(password)) {
                setLoggedIn(true);
                setFailedLoginAttempts(0);
            } else {
                System.out.println("You have an entered an incorrect password. Please try again.");
                setFailedLoginAttempts(getFailedLoginAttempts() + 1);
            }
        }
    }

    /**
     * Getter method to return the list of all titles bought by the user.
     *
     * @return The current list of titles bought by the user.
     */
    @Override
    public ArrayList<MusicTitle> getTitlesBought() {
        return titlesBought;
    }

    /**
     * Adds the amount - if positive - to the current balance. For
     * non-positive amounts the action does nothing.
     *
     * @param amount The amount being deposited.
     */
    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /**
     * Setter for the balance.
     *
     * @param balance The new balance of the account.
     */
    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * Getter method to return the number of failed login attempts.
     *
     * @return The number of failed login attempts.
     */
    @Override
    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    /**
     * Setter for the failed login attempts.
     *
     * @param failedLoginAttempts The new number of failed login attempts.
     */
    @Override
    public void setFailedLoginAttempts(int failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    /**
     * If the user is logged in and has sufficient funds, a music
     * title is bought by adding the title to the ArrayList of
     * titlesBought of the customer. Furthermore the price of the
     * title is subtracted from the funds of the customer. If the
     * user is not logged in, a corresponding warning is to be
     * printed. Likewise if the user has insufficient funds, they
     * should be asked to pay money into their account.
     *
     * @param musicTitle The music title that the customer wants to
     *                   buy.
     */
    @Override
    public void buy(MusicTitle musicTitle) {
        if (getLoggedIn()) {
            if (musicTitle.getPrice() < balance) {
                titlesBought.add(musicTitle);
                balance -= musicTitle.getPrice();
            } else {
                System.out.println("You do not have sufficient funds to purchase this title.");
            }
        } else {
            System.out.println("You must be logged in to be able to use this feature.");
        }
    }
}
