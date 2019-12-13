/**
 * MusicTitle is a class that stores various information about a music track.
 * @author Izhaar Dharsee IMD961
 * @version 10/11/2019
 */

public class MusicTitle implements MusicTitleInterface {
    private String title;
    private String artist;
    private int price;

    /**
     * Constructor for a MusicTitle object.
     * @param title The title of the track; String
     * @param artist The artist of the track; String
     * @param price The price of the track; int
     */
    public MusicTitle(String title, String artist, int price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    /**
     * Returns the title of the track
     * @return The title of the track; String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the artist of the track
     * @return The artist of the track; String
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Returns the price of the track
     * @return The price of the track; int
     */
    public int getPrice() {
        return price;
    }
}
