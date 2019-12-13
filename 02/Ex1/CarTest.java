/**
 * This a test file for the Car.java file.
 *
 * @author Izhaar Dharsee
 * @version 2019-10-08
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car1;

    @BeforeEach
    void beforeEach() {
        car1 = new Car("Tesla", 26500, 200, "Black");
    }

    @Test
    void getMake() {
        String expected = "Tesla";
        String actual = car1.getMake();
        assertEquals(expected, actual, "The actual make does not match the expected make.");
    }

    @Test
    void getPrice() {
        int expected = 26500;
        int actual = car1.getPrice();
        assertEquals(expected, actual, "The actual price does not match the expected price.");

    }

    @Test
    void getMaxSpeed() {
        int expected = 200;
        int actual = car1.getMaxSpeed();
        assertEquals(expected, actual, "The actual maxSpeed does not match the expected maxSpeed.");
    }

    @Test
    void getColour() {
        String expected = "Black";
        String actual = car1.getColour();
        assertEquals(expected, actual, "The actual colour does not match the expected colour.");
    }

    @Test
    void setMake() {
        String expected = "Toyota";
        car1.setMake(expected);
        String actual = car1.getMake();
        assertEquals(expected, actual, "The actual make does not match the expected make.");
    }

    @Test
    void setPrice() {
        int expected = 29000;
        car1.setPrice(expected);
        int actual = car1.getPrice();
        assertEquals(expected, actual, "The actual price does not match the expected price.");
    }

    @Test
    void setMaxSpeed() {
        int expected = 205;
        car1.setMaxSpeed(expected);
        int actual = car1.getMaxSpeed();
        assertEquals(expected, actual, "The actual maxSpeed does not match the expected maxSpeed.");
    }

    @Test
    void setColour() {
        String expected = "Cherry red";
        car1.setColour(expected);
        String actual = car1.getColour();
        assertEquals(expected, actual, "The actual colour does not match the expected colour.");
    }

    @Test
    void testToString() {
        String expected = "Make: Tesla Price: 26500 Maximum Speed: 200 Colour: Black";
        String actual = car1.toString();
        assertEquals(expected, actual, "The actual toString does not match the expected toString");
    }
}