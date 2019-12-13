import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Izhaar Dharsee IMD961
 * @version 02/12/2019
 */

class WaffleTest {

    Expenditure[] expenditures = new Expenditure[10];

    @BeforeEach
    void setup () {
        for (int i = 0; i < expenditures.length; i++) {
            expenditures[i] = new Expenditure("Expenditure " + i, i * 1000);
        }
    }

    @Test
    void formatExpenditures() {
        Expenditure[] formattedExpenditures = Waffle.formatExpenditures(expenditures);
        String[] expectedFormattedExpenditures = new String[]{
                "Expenditure 9: 20",
                "Expenditure 8: 18",
                "Expenditure 7: 16",
                "Expenditure 6: 13",
                "Expenditure 5: 11",
                "Expenditure 4: 9",
                "Expenditure 3: 7",
                "Other: 7"
        };
        for (int i = 0; i < formattedExpenditures.length; i++) {
            assertEquals(expectedFormattedExpenditures[i], formattedExpenditures[i].getDescription() + ": " + formattedExpenditures[i].getValue());
        }
    }

    @Test
    void getDescription() {
        String[] expectedDescriptions = new String[] {
                "Expenditure 0",
                "Expenditure 1",
                "Expenditure 2",
                "Expenditure 3",
                "Expenditure 4",
                "Expenditure 5",
                "Expenditure 6",
                "Expenditure 7",
                "Expenditure 8",
                "Expenditure 9",
        };
        for (int i = 0; i < expenditures.length; i++) {
            assertEquals(expectedDescriptions[i], expenditures[i].getDescription());
        }
    }

    @Test
    void getValue() {
        int[] expectedDescriptions = new int[] {
                0,
                1000,
                2000,
                3000,
                4000,
                5000,
                6000,
                7000,
                8000,
                9000,
        };
        for (int i = 0; i < expenditures.length; i++) {
            assertEquals(expectedDescriptions[i], expenditures[i].getValue());
        }
    }
}