/**
 * The Temperature class finds the day in a year where the temperature was the lowest in that year.
 * @author Izhaar Dharsee IMD961
 * @version 22-10-2019
 */

public class Temperature {

    //private double[] temperatures = new double[365];

    /**
     * The coldest method finds the minimum temperature in the temperature array by looping through the array and returns the day on which this temperature occurred in the year.
     * @param temperatures An array of 365 total temperatures signifying the temperature of each day.
     * @return The day from 1-365 on which the temperature was at the lowest.
     */
    public static int coldest (double[] temperatures) {
        int day = 0;
        double minTemp = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < minTemp) {
                minTemp = temperatures[i];
                day = i;
            }
        }
        return day + 1;
    }
}
