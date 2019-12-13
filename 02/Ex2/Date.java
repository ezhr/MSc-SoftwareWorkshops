public class Date{
    private int    day;
    private String month;
    private int    year;

    /** This constructor creates a date from the three parts:
     * day, month, and year, which are an int, a String,
     * and an int, respectively.
     * @param d The day of the month (e.g., 8 in 8 October 2019
     * @param m The month in the year (e.g., "October" in 8 October 2019
     * @param y The year (e.g., 2019 in 8 October 2019)
     */
    public Date(int d, String m, int y){
        day = d;
        month = m;
        year = y;
    }
    /**
     * @return The day of a Date (e.g., 8 from 8 October 2019). */
    public int getDay(){
        return day;
    }
    /**
     * @return The month of a Date (e.g., "October" from 8 Octo */
    public String getMonth(){
        return month;
    }
    /**
     * @return The year of a Date (e.g., 2019 from 8 October 20 */
    public int getYear(){
        return year;
    }
    /**
     * sets the day of a Date
     * @param newDay is the new day to which the day is set
     */
    public void setDay(int newDay){
        day = newDay;
    }
    /**
     * sets the month of a Date
     * @param newMonth is the new month to which the month is s
     */
    public void setMonth(String newMonth){
        month = newMonth;
    }

    /**
     * this method says how to print a date
     * @return A String how the object is printed. */
    public String toString(){
        return day + " " + month + " " + year;    // European
        //return year + ", " + month + " " + day; // American
    }
}