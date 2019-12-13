import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Izhaar Dharsee IMD961
 * @version 13/11/2019
 */

class AircraftTest {

    private Aircraft aircraft1;
    private Aircraft aircraft2;
    private Aeroplane aeroplane1;
    private Aeroplane aeroplane2;

    @BeforeEach
    void setUp() {
        aircraft1 = new Aircraft(309, 550);
        aircraft2 = new Aircraft(20, 180);
        aeroplane1 = new Aeroplane(550, 480, 20.0);
        aeroplane2 = new Aeroplane(450, 350, 34.4);
    }

    @Test
    void getPassengerNumber() {
        int expected1 = 309;
        int expected2 = 20;
        int expected3 = 550;
        int expected4 = 450;

        assertEquals(expected1, aircraft1.getPassengerNumber());
        assertEquals(expected2, aircraft2.getPassengerNumber());
        assertEquals(expected3, aeroplane1.getPassengerNumber());
        assertEquals(expected4, aeroplane2.getPassengerNumber());
    }

    @Test
    void setPassengerNumber() {
        int expected1 = 330;
        int expected2 = 40;
        int expected3 = 510;
        int expected4 = 40;

        aircraft1.setPassengerNumber(expected1);
        aircraft2.setPassengerNumber(expected2);
        aeroplane1.setPassengerNumber(expected3);
        aeroplane2.setPassengerNumber(expected4);

        assertEquals(expected1, aircraft1.getPassengerNumber());
        assertEquals(expected2, aircraft2.getPassengerNumber());
        assertEquals(expected3, aeroplane1.getPassengerNumber());
        assertEquals(expected4, aeroplane2.getPassengerNumber());
    }

    @Test
    void getMaxSpeed() {
        int expected1 = 550;
        int expected2 = 180;
        int expected3 = 480;
        int expected4 = 350;

        assertEquals(expected1, aircraft1.getMaxSpeed());
        assertEquals(expected2, aircraft2.getMaxSpeed());
        assertEquals(expected3, aeroplane1.getMaxSpeed());
        assertEquals(expected4, aeroplane2.getMaxSpeed());
    }

    @Test
    void setMaxSpeed() {
        int expected1 = 430;
        int expected2 = 220;
        int expected3 = 440;
        int expected4 = 330;

        aircraft1.setMaxSpeed(expected1);
        aircraft2.setMaxSpeed(expected2);
        aeroplane1.setMaxSpeed(expected3);
        aeroplane2.setMaxSpeed(expected4);

        assertEquals(expected1, aircraft1.getMaxSpeed());
        assertEquals(expected2, aircraft2.getMaxSpeed());
        assertEquals(expected3, aeroplane1.getMaxSpeed());
        assertEquals(expected4, aeroplane2.getMaxSpeed());
    }


    @Test
    void getFuelConsumption() {
        double expected1 = 20.0;
        double expected2 = 34.4;

        assertEquals(expected1, aeroplane1.getFuelConsumption());
        assertEquals(expected2, aeroplane2.getFuelConsumption());
    }

    @Test
    void setFuelConsumption() {
        double expected1 = 11.2;
        double expected2 = 20.9 ;

        aeroplane1.setFuelConsumption(expected1);
        aeroplane2.setFuelConsumption(expected2);

        assertEquals(expected1, aeroplane1.getFuelConsumption());
        assertEquals(expected2, aeroplane2.getFuelConsumption());
    }

    @Test
    void testToString() {
        String expected1 = "Passenger Number: 309\nMaximum Speed: 550";
        String expected2 = "Passenger Number: 20\nMaximum Speed: 180";
        String expected3 = "Passenger Number: 550\nMaximum Speed: 480\nFuel Consumption: 20.0";
        String expected4 = "Passenger Number: 450\nMaximum Speed: 350\nFuel Consumption: 34.4";

        assertEquals(expected1, aircraft1.toString());
        assertEquals(expected2, aircraft2.toString());
        assertEquals(expected3, aeroplane1.toString());
        assertEquals(expected4, aeroplane2.toString());
    }
}