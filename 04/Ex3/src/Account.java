/**
 * The abstract Account class details the methods that are implemented by the class.
 * It is a superclass that is extended by the AccountAdministrator and AccountStandard
 * classes to enhance functionality based on their individual requirements.
 *
 * @author Izhaar Dharsee IMD961
 * @version 10/11/2019
 */

public abstract class Account implements AccountInterface {
    private String name;
    private String salutation;
    private String email;
    private String password;
    private boolean loggedIn;

    /**
     * Constructor for class Account, will be inherited by its subclasses.
     * @param name The username of the account holder; String
     * @param salutation The salutation of the account holder; String
     * @param email The email of the account holder; String
     * @param password The password of the account holder; String
     */
    public Account(String name, String salutation, String email, String password) {
        this.name = name;
        this.salutation = salutation;
        this.email = email;
        this.password = password;
    }

    /**
     * We require in each sub-class the existence of a login method.
     *
     * @param password The password provided that will be compared to
     *                 the password stored on the system, i.e., the value of the
     *                 field variable. If the password provided is correct, the field
     *                 variable loggedIn is changes to true, else a warning is to be
     *                 printed.
     */
    @Override
    public void login(String password) {
        if (checkPassword(password)) {
            loggedIn = true;
        } else {
            System.out.println("You have an entered an incorrect password. Please try again.");
        }
    }

    /**
     * Getter to check whether a user is logged in.
     * <p>
     * If the user is not loggedIn the toString method should be
     * disabled and only a warning should be printed that first a
     * login is necessary. Further methods may be disabled in
     * sub-classes.
     *
     * @return true if the user is looged in, false else.
     */
    @Override
    public boolean getLoggedIn() {
        return loggedIn;
    }

    /**
     * setter for loggedIn
     *
     * @param loggedIn New value for the variable loggedIn
     */
    @Override
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /**
     * The user is no longer logged in, that is, the
     * loggedIn variable set to false.
     */
    @Override
    public void logout() {
        loggedIn = false;
    }

    /**
     * Getter method to return the name of the user.
     *
     * @return The name of the user of the account.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Getter method to return the salutation of the account holder.
     *
     * @return The salutation of the account holder (e.g., "Mr", "Ms",
     * "Mrs", "Dr", "Prof")
     */
    @Override
    public String getSalutation() {
        return salutation;
    }

    /**
     * Getter method to return the email address of the account holder.
     *
     * @return The email address of the account holder.
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Getter method to return the password.
     *
     * @return The password of the account.
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * Setter for the password.
     *
     * @param password The new password.
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method to compare a provided password with the stored password.
     *
     * @param password The provided password to which the password of
     *                 the this object is compared.
     * @return true if the password of the account agrees with the
     * argument, false else.
     */
    @Override
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    /**
     * Changes the password from old to new if the old password is
     * correct, else an error message is printed.
     *
     * @param oldPassword The current password.
     * @param newPassword The future password.
     */
    @Override
    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
        }
    }

    /**
     * toString method that returns the details of the account in human readable format.
     * Will only return the details of the account if a user is logged in, otherwise displays
     * an error message notifying the user to sign in.
     *
     * @return String details of the user
     */
    @Override
    public String toString() {
        if (this.loggedIn) {
            return ("Name: " + name + "\nSalutation: " + salutation + "\nEmail: " + email + "\nPassword: " + password);
        } else {
            return "Please log in to continue.";
        }
    }
}
