import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Izhaar Dharsee IMD961
 * @version 02/12/2019
 */

class PieTest {

    Expenditure[] expenditures = new Expenditure[10];

    @BeforeEach
    void setup () {
        for (int i = 0; i < expenditures.length; i++) {
            expenditures[i] = new Expenditure("Expenditure " + i, i * 1000);
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
    void formatExpenditures() {
        Expenditure[] formattedExpenditures = Pie.formatExpenditures(expenditures);
        String[] expectedFormattedExpenditures = new String[]{
                "Expenditure 9: 72",
                "Expenditure 8: 64",
                "Expenditure 7: 56",
                "Expenditure 6: 48",
                "Expenditure 5: 40",
                "Expenditure 4: 32",
                "Expenditure 3: 24",
                "Other: 24"
        };
        for (Expenditure item : formattedExpenditures) {
            System.out.println(item.getDescription()+ " " + item.getValue());
        }
        for (int i = 0; i < formattedExpenditures.length; i++) {
            assertEquals(expectedFormattedExpenditures[i], formattedExpenditures[i].getDescription() + ": " + formattedExpenditures[i].getValue());
        }
    }

}