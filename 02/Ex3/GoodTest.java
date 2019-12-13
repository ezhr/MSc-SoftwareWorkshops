/**
 * Test file for the Good.java file
 * @author Izhaar Dharsee
 * @version 2019-10-08
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodTest {

    private Good bread;

    @BeforeEach
    void setUp() {
        bread = new Good("Seeded bread", 1.10);
    }

    @Test
    void getName() {
        String expected = "Seeded bread";
        String actual = bread.getName();
        assertEquals(expected, actual, "The actual name does not match the expected name");
    }

    @Test
    void getNetPrice() {
        double expected = 1.10;
        double actual = bread.getNetPrice();
        assertEquals(expected, actual, "The actual net price does not match the expected net price.");
    }

    @Test
    void setName() {
        String expected = "Wholemeal bread";
        bread.setName(expected);
        String actual = bread.getName();
        assertEquals(expected, actual, "The actual name does not match the expected name.");
    }

    @Test
    void setNetPrice() {
        double expected = 0.79;
        bread.setNetPrice(expected);
        double actual = bread.getNetPrice();
        assertEquals(expected, actual, "The actual net price does not match the expected net price.");
    }

    @Test
    void testToString() {
        String expected = "The Seeded bread has a gross price of \u00A31.32.";
        String actual = bread.toString();
        assertEquals(expected, actual, "The actual toString does not match the expected toString.");
    }

    @Test
    void grossPrice() {
        double expected = 1.32;
        double actual = bread.grossPrice();
        assertEquals(expected, actual, 0.01, "The actual grossPrice does not match the expected grossPrice.");
    }

    @Test
    void discount() {
        String expected = "The Seeded bread has a gross price of \u00A31.06.";
        bread.discount(20);
        String actual = bread.toString();
        assertEquals(expected, actual,"The actual net price calculated does not match the expected net price.");
    }
}