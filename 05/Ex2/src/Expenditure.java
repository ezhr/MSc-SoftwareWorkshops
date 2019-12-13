/**
 * Expenditure.java is a class that stores information about an
 * expenditure, namely its description and its value.
 *
 * @author Izhaar Dharsee IMD961
 * @version 25/11/2019
 */

public class Expenditure {
    private String description;
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }

    public Expenditure(String description, int value) {
        this.description = description;
        this.value = value;
    }


}
