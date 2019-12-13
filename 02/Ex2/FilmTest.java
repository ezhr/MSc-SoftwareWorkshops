/**
 * Tests the methods developed in the Film class.
 * @author Izhaar Dharsee
 * @version 2019-10-08
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    private Film film;

    @BeforeEach
    void beforeEach() {
        film = new Film("The Imitation Game", new Date(28, "November", 2014), 114);
    }

    @Test
    void getTitle() {
        String expected = "The Imitation Game";
        String actual = film.getTitle();
        assertEquals(expected, actual, "The actual title is not the same as the expected title");
    }

    @Test
    void getReleaseDate() {
        String expected = new Date(28, "November", 2014).toString();
        String actual = film.getReleaseDate().toString();
        assertEquals(expected, actual, "The actual release date is not the same as the expected release date");
    }

    @Test
    void getLength() {
        int expected = 114;
        int actual = film.getLength();
        assertEquals(expected, actual, "The actual length is not the same as the expected length");
    }

    @Test
    void setReleaseDate() {
        Date expected = new Date(19, "May", 1989);
        film.setReleaseDate(expected);
        Date actual = film.getReleaseDate();
        assertEquals(expected, actual, "The actual release date is not the same as the expected release date");
    }

    @Test
    void testToString() {
        String expected = "Title: The Imitation Game Release Date: 28 November 2014 Length: 114";
        String actual = film.toString();
        assertEquals(expected, actual, "The actual toString does not match the expected toString");
    }
}