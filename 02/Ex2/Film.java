/**
 * Film is a class that stores information about a film. It stores the title, the release date, and the length of the movie.
 * @author Izhaar Dharsee
 * @version 2019-10-08
 */


public class Film{
    private String title;
    private Date releaseDate;
    private int length;



    /**
     * The constructor for film takes in 3 arguments and creates a Film object with those parameters
     * @param title The title of the film, a String
     * @param releaseDate The release date of the film, a Date object
     * @param length The length of the film, an int
     */
    public Film(String title, Date releaseDate, int length){
        this.title = title;
        this.releaseDate = releaseDate;
        this.length = length;
    }

    /**
     * The getTitle getter method returns the title of the film.
     * @return title as a String
     */
    public String getTitle(){
        return title;
    }

    /**
     * The getReleaseDate getter method returns the release date of the film.
     * @return releaseDate as a Date object
     */
    public Date getReleaseDate(){
        return releaseDate;
    }

    /**
     * The getLength getter method returns the length of the film
     * @return length as an int
     */
    public int getLength(){
        return length;
    }

    /**
     * The setReleaseDate method changes the release date of the film to that which is passed as a parameter to the method.
     * @param releaseDate the release date of the film as an int
     */
    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }

    /**
     * The toString method returns the contents of the Film object in a human-readable manner.
     * @return Film object in a String format
     */
    public String toString(){
        return ("Title: " + this.title + " Release Date: " + this.releaseDate + " Length: " + this.length);
    }

    public static void main(String[] args) {
        Film adAstra = new Film("Ad Astra", new Date(18, "September", 2019), 123);
    }
}