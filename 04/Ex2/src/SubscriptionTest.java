import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Izhaar Dharsee IMD961
 * @version 13/11/2019
 */

class SubscriptionTest {

    private Subscription subscription1;
    private Subscription subscription2;
    private SubscriptionPrime subscription3;
    private SubscriptionPrime subscription4;

    @BeforeEach
    void setUp() {
        subscription1 = new Subscription("ABC Times", "vasiflug@simkugom.kp", 11);
        subscription2 = new Subscription("The DEF", "loproco@murjim.mo", 15);
        subscription3 = new SubscriptionPrime("GHI Monthly", "jog@nu.sy", 6, "1881 Gefa Court");
        subscription4 = new SubscriptionPrime("The XYZ", "zewaaci@pa.om", 5, "449 Cume Square");
    }

    @Test
    void getTitle() {
        String expected1 = "ABC Times";
        String expected2 = "The DEF";
        String expected3 = "GHI Monthly";
        String expected4 = "The XYZ";

        assertEquals(expected1, subscription1.getTitle());
        assertEquals(expected2, subscription2.getTitle());
        assertEquals(expected3, subscription3.getTitle());
        assertEquals(expected4, subscription4.getTitle());
    }

    @Test
    void getEmail() {
        String expected1 = "vasiflug@simkugom.kp";
        String expected2 = "loproco@murjim.mo";
        String expected3 = "jog@nu.sy";
        String expected4 = "zewaaci@pa.om";

        assertEquals(expected1, subscription1.getEmail());
        assertEquals(expected2, subscription2.getEmail());
        assertEquals(expected3, subscription3.getEmail());
        assertEquals(expected4, subscription4.getEmail());
    }

    @Test
    void getCost() {
        int expected1 = 11;
        int expected2 = 15;
        int expected3 = 6;
        int expected4 = 5;

        assertEquals(expected1, subscription1.getCost());
        assertEquals(expected2, subscription2.getCost());
        assertEquals(expected3, subscription3.getCost());
        assertEquals(expected4, subscription4.getCost());
    }

    @Test
    void getAddress() {
        String expected1 = "1881 Gefa Court";
        String expected2 = "449 Cume Square";

        assertEquals(expected1, subscription3.getAddress());
        assertEquals(expected2, subscription4.getAddress());
    }
}