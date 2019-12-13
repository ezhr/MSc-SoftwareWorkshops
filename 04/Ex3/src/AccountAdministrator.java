import java.util.ArrayList;

/**
 * The AccountAdministrator class allows for administrative users to be created for
 * the system, giving them elevated access. Examples of this include the ability to
 * reset passwords for standard users, as well as not having a limit on incorrect
 * password entry.
 *
 * @author Izhaar Dharsee IMD961
 * @version 10/11/2019
 */

public class AccountAdministrator extends Account implements AccountAdministratorInterface {

    private ArrayList<Account> accounts = new ArrayList<>();

    /**
     * Constructor for an Administrator Account, is implemented by the superclass.
     * @param name The username of the account holder; String
     * @param salutation The salutation of the account holder; String
     * @param email The email of the account holder; String
     * @param password The password of the account holder; String
     */
    public AccountAdministrator(String name, String salutation, String email, String password) {
        super(name, salutation, email, password);
    }

    /**
     * Getter method to return the list of accounts the administrator
     * looks after.
     *
     * @return The list of accounts the administrator looks after.
     */
    @Override
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * The method adds an account to the list of accounts the
     * administrator looks after.
     *
     * @param account
     */
    @Override
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * If an account can no longer be used, since either the user has
     * forgotten their password or in case of a standard user has
     * entered the password incorrectly too often the administrator
     * can reset the account by setting a new password and resetting
     * the number of failed login attempts to zero (the latter only
     * if the account is a standard account).
     *
     * @param account  The account that is to be reset.
     * @param password The new password for the account that is to be
     */
    @Override
    public void resetAccount(Account account, String password) {
        if (getLoggedIn()) {
            account.setPassword(password);
            if (account instanceof AccountStandard) {
                ((AccountStandard) account).setFailedLoginAttempts(0);
            }
        }
    }
}
