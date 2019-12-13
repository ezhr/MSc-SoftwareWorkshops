import java.util.*;
import java.util.regex.Pattern;

/**
 * Errors in the program:
 * 1. The switch case statement executes all cases; fixed by adding break; statements at the end of each case.
 * 2. All the methods set variable s to a new Scanner object in the catch phrase which was unnecessary; fixed by commenting out the statements s = new Scanner(System.in3);
 * 3. Setting topChoice in the while loop causes the program to crash if any input other than 1-5 is entered; fixed by surrounding with a try/catch and handling the exception accordingly.
 * 4. The scanner was also not closed at the end of the program leading to memory leaks; s.close() was added to the program under case 5.
 * 5. The default case was not needed in the switch case as all input values are taken care of; default case removed
 */

/**
 * The class is used in order to interactively count a number of
 * persons/items in a room, storeroom, etc. A user is able to select * between five options:
 *
 * <pre>
 * 1. add to the counter,
 * 2. subtract from the counter,
 * 3. show the counter,
 * 4. set the counter to a new value, and
 * 5. exit the program.
 *
 * </pre>
 * @author Manfred Kerber and Alexandros Evangelidis
 * @version 2019-10-21
 */

public class Counter {
    /**
     * Pattern for the choice of input: either 1, 2, 3, 4, or 5
     */
    public static final Pattern p12345 = Pattern.compile("[12345]");
    /**
     * Field variable to store the value of the counter.
     */
    private int counter;

    /**
     * The constructor initializes the counter as 0. Starts a scanner * to read from the command line, offering 5 choices for (add, * subtract, show counter, set counter, and exit). It stays in a * loop until the program is explicitly exited by entering 5.
     * <p>
     * It has no parameters.
     */
    public Counter() {
        this.counter = 0;
        // System.in is like System.out, however, for input and not for output.
        Scanner s = new Scanner(System.in);
        /* can take value 1 (add)
        * 2 (subtract)
        * 3 (show counter)
        * 4 (set counter)
        * 5 (exit)
        */
        byte topChoice = 1; // Can be anything but 5 to enter the loop
        while (topChoice != 5) {
            System.out.println("Please enter:\n" +
                    "1 to add to the total\n" +
                    "2 to subtract from the total\n" +
                    "3 to show the total\n" +
                    "4 to set the total\n" +
                    "5 to exit the program");

            try {
                topChoice = (byte) Integer.parseInt(s.next(p12345));
            } catch (InputMismatchException e) {
                System.out.println(s.next() + " is not a valid selection. Please enter a selection from 1-5.");
                //s = new Scanner(System.in);
                continue;
            }

            switch (topChoice) {
                case 1:
                    add(s);
                    break;
                case 2:
                    subtract(s);
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    set(s);
                    break;
                case 5:
                    System.out.println("Finally there are " + counter + " items available.");
                    break;
                default:
                    throw new IllegalArgumentException();
            }

        }
        s.close();

    }

    /**
     * The method reads in a number from the input and adds it to the counter.
     * @param s The scanner from which the input is read.
     */
    public void add(Scanner s) {

        System.out.println("How much to add?");

        try {

            counter += Integer.parseInt(s.next());

        } catch (NumberFormatException e) {

            System.out.println("You need to enter an integer.");

            //s = new Scanner(System.in);

        }
    }

    /**
     * The method reads in a number from the input and subtracts it * from the counter.
     *
     * @param s The scanner from which the input is read.
     */
    public void subtract(Scanner s) {

        System.out.println("How much to subtract?");

        try {

            counter -= Integer.parseInt(s.next());

        } catch (NumberFormatException e) {

            System.out.println("You need to enter an integer.");

            //s = new Scanner(System.in);

        }
    }

    /**
     * The method prints the current value of the counter.
     */
    public void show() {

        System.out.println("Currently there are " + counter + " items available.");
    }

    /**
     * The method reads in a number from the input and sets the * counter to this value * @param s The scanner from which the input is read.
     */
    public void set(Scanner s) {

        System.out.println("To which value do you want to set the counter?");

        try {

            counter = Integer.parseInt(s.next());

        } catch (NumberFormatException e) {

            System.out.println("You need to enter an integer.");

            //s = new Scanner(System.in);

        }
    }

    public static void main(String[] args) {

        Counter parcels = new Counter();
    }

}
