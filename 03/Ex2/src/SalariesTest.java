import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Izhaar Dharsee IMD961
 * @version 03/11/2019
 */

class SalariesTest {

    public static final double TOLERANCE = 0.0000000001;
    private Salaries salaries;

    private double[] salary1 = {5400, 4050, 4630, 7670, 9500, 2620, 1590, 2900, 3190, 7450, 7650, 9360};
    private double[] salary2 = {6750, 9750, 7640, 8750, 1790, 0, 0, 0, 0, 0, 0, 0};
    private double[] salary3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private double[] salary4 = {10000, 0, 600, 0, 1530, 0, 9050, 0, 9110, 0, 3380, 0};

    private double expected1 = 5500.833333333333;
    private double expected2 = 6936.0;
    private double expected4 = 5611.666666666667;


    @BeforeEach
    void setUp() {
        salaries = new Salaries();
        salaries.add(salary1);
        salaries.add(salary2);
        salaries.add(salary3);
        salaries.add(salary4);
    }

    @Test
    void add() {
        ArrayList actual = salaries.allSalaries;

        ArrayList<double[]> expected = new ArrayList<>();
        expected.add(salary1);
        expected.add(salary2);
        expected.add(salary3);
        expected.add(salary4);

        assertEquals(expected, actual, "The actual allSalaries ArrayList does not match the expected ArrayList");
    }

    @Test
    void average() {
        double actual1 = Salaries.average(salary1);
        double actual2 = Salaries.average(salary2);
        double actual4 = Salaries.average(salary4);

        assertThrows(IllegalArgumentException.class, () -> {
            Salaries.average(salary3);
        });
        assertEquals(expected1, actual1, TOLERANCE, "Average values do not match. Expected: " + expected1 + "; Actual: " + actual1);
        assertEquals(expected2, actual2, TOLERANCE, "Average values do not match. Expected: " + expected2 + "; Actual: " + actual2);
        assertEquals(expected4, actual4, TOLERANCE, "Average values do not match. Expected: " + expected4 + "; Actual: " + actual4);
    }

    @Test
    void averageSalaries() {
        ArrayList<Double> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected4);

        ArrayList actual = salaries.averageSalaries();

        assertEquals(expected, actual, "The actual averages ArrayList does not match the expected averages ArrayList.");
    }

    @Test
    void not3TimesHigher1() {
        assertTrue(salaries.not3TimesHigher());
    }

    @Test
    void not3TimesHigher2() {
        salaries.add(new double[]{1000000});
        assertFalse(salaries.not3TimesHigher());
    }
}