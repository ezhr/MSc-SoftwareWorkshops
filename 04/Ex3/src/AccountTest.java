import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Izhaar Dharsee IMD961
 * @version 14/11/2019
 */

class AccountTest {

    private AccountStandard accountStandard1;
    private AccountStandard accountStandard2;
    private AccountAdministrator accountAdministrator1;
    private AccountAdministrator accountAdministrator2;

    private MusicTitle musicTitle1;
    private MusicTitle musicTitle2;

    @BeforeEach
    void setUp() {
        accountStandard1 = new AccountStandard("James Foster", "Mr", "laef@epoca.fi", "HHLY5fc4QCy");
        accountStandard2 = new AccountStandard("Leah Brewer", "Ms", "jeflegip@nego.mv", "LL55WQFNez0rex");
        accountAdministrator1 = new AccountAdministrator("Gregory Ryan", "Mr", "an@aga.fo", "kPWT70");
        accountAdministrator2 = new AccountAdministrator("Timothy Hogan", "Mr", "tiverdi@tirinfu.mw", "NFs7Yl");

        musicTitle1 = new MusicTitle("Television Shop", "Rosetta Chavez", 3);
        musicTitle2 = new MusicTitle("System Change", "Hunter Boyd", 9);
    }

    @Test
    void getTitle() {
        String expected1 = "Television Shop";
        String expected2 = "System Change";

        assertEquals(expected1, musicTitle1.getTitle());
        assertEquals(expected2, musicTitle2.getTitle());
    }

    @Test
    void getArtist() {
        String expected1 = "Rosetta Chavez";
        String expected2 = "Hunter Boyd";

        assertEquals(expected1, musicTitle1.getArtist());
        assertEquals(expected2, musicTitle2.getArtist());
    }

    @Test
    void getPrice() {
        int expected1 = 3;
        int expected2 = 9;

        assertEquals(expected1, musicTitle1.getPrice());
        assertEquals(expected2, musicTitle2.getPrice());
    }

    @Test
    void getLoggedIn() {
        accountStandard1.login("HHLY5fc4QCy");
        accountStandard1.login("HHLY5fc4QCy");
        accountAdministrator1.login("kPWT70");
        accountAdministrator2.login("kPWT70");

        assertTrue(accountStandard1.getLoggedIn());
        assertFalse(accountStandard2.getLoggedIn());
        assertTrue(accountAdministrator1.getLoggedIn());
        assertFalse(accountAdministrator2.getLoggedIn());
    }

    @Test
    void setLoggedIn() {
        accountStandard1.setLoggedIn(false);
        accountStandard2.setLoggedIn(true);
        accountAdministrator1.setLoggedIn(false);
        accountAdministrator2.setLoggedIn(true);

        assertFalse(accountStandard1.getLoggedIn());
        assertTrue(accountStandard2.getLoggedIn());
        assertFalse(accountAdministrator1.getLoggedIn());
        assertTrue(accountAdministrator2.getLoggedIn());
    }

    @Test
    void logout() {
        accountStandard1.setLoggedIn(true);
        accountStandard2.setLoggedIn(true);
        accountAdministrator1.setLoggedIn(true);
        accountAdministrator2.setLoggedIn(true);

        accountStandard1.logout();
        accountStandard2.logout();
        accountAdministrator1.logout();
        accountAdministrator2.logout();

        assertFalse(accountStandard1.getLoggedIn());
        assertFalse(accountStandard2.getLoggedIn());
        assertFalse(accountAdministrator1.getLoggedIn());
        assertFalse(accountAdministrator2.getLoggedIn());
    }

    @Test
    void getName() {
        String expected1 = "James Foster";
        String expected2 = "Leah Brewer";
        String expected3 = "Gregory Ryan";
        String expected4 = "Timothy Hogan";

        assertEquals(expected1, accountStandard1.getName());
        assertEquals(expected2, accountStandard2.getName());
        assertEquals(expected3, accountAdministrator1.getName());
        assertEquals(expected4, accountAdministrator2.getName());
    }

    @Test
    void getSalutation() {
        String expected1 = "Mr";
        String expected2 = "Ms";
        String expected3 = "Mr";
        String expected4 = "Mr";

        assertEquals(expected1, accountStandard1.getSalutation());
        assertEquals(expected2, accountStandard2.getSalutation());
        assertEquals(expected3, accountAdministrator1.getSalutation());
        assertEquals(expected4, accountAdministrator2.getSalutation());
    }

    @Test
    void getEmail() {
        String expected1 = "laef@epoca.fi";
        String expected2 = "jeflegip@nego.mv";
        String expected3 = "an@aga.fo";
        String expected4 = "tiverdi@tirinfu.mw";

        assertEquals(expected1, accountStandard1.getEmail());
        assertEquals(expected2, accountStandard2.getEmail());
        assertEquals(expected3, accountAdministrator1.getEmail());
        assertEquals(expected4, accountAdministrator2.getEmail());
    }

    @Test
    void getPassword() {
        String expected1 = "HHLY5fc4QCy";
        String expected2 = "LL55WQFNez0rex";
        String expected3 = "kPWT70";
        String expected4 = "NFs7Yl";

        assertEquals(expected1, accountStandard1.getPassword());
        assertEquals(expected2, accountStandard2.getPassword());
        assertEquals(expected3, accountAdministrator1.getPassword());
        assertEquals(expected4, accountAdministrator2.getPassword());
    }

    @Test
    void setPassword() {
        String expected1 = "U6J22FgWBcVm5ABs";
        String expected2 = "W9WbUrNCBhosxg4";
        String expected3 = "04yZR7o78lL3GnhUR";
        String expected4 = "mvFAnj";

        accountStandard1.setPassword(expected1);
        accountStandard2.setPassword(expected2);
        accountAdministrator1.setPassword(expected3);
        accountAdministrator2.setPassword(expected4);

        assertEquals(expected1, accountStandard1.getPassword());
        assertEquals(expected2, accountStandard2.getPassword());
        assertEquals(expected3, accountAdministrator1.getPassword());
        assertEquals(expected4, accountAdministrator2.getPassword());
    }

    @Test
    void checkPassword() {
        assertTrue(accountStandard1.checkPassword("HHLY5fc4QCy"));
        assertFalse(accountStandard2.checkPassword("HHLY5fc4QCy"));
        assertTrue(accountAdministrator1.checkPassword("kPWT70"));
        assertFalse(accountAdministrator2.checkPassword("kPWT70"));
    }

    @Test
    void changePassword() {
        String oldPassword1 = "HHLY5fc4QCy";
        String oldPassword2 = "LL55WQFNez0rex";
        String oldPassword3 = "kPWT70";
        String oldPassword4 = "NFs7Yl";

        String newPassword1 = "U6J22FgWBcVm5ABs";
        String newPassword2 = "W9WbUrNCBhosxg4";
        String newPassword3 = "04yZR7o78lL3GnhUR";
        String newPassword4 = "mvFAnj";

        accountStandard1.changePassword(oldPassword1, newPassword1);
        accountStandard2.changePassword(oldPassword2, newPassword2);
        accountAdministrator1.changePassword(oldPassword3, newPassword3);
        accountAdministrator2.changePassword(oldPassword4, newPassword4);

        assertEquals(newPassword1, accountStandard1.getPassword());
        assertEquals(newPassword2, accountStandard2.getPassword());
        assertEquals(newPassword3, accountAdministrator1.getPassword());
        assertEquals(newPassword4, accountAdministrator2.getPassword());
    }

    @Test
    void testToString() {
        String expected1 = "Please log in to continue.";
        String expected2 = "Name: Leah Brewer\nSalutation: Ms\nEmail: jeflegip@nego.mv\nPassword: LL55WQFNez0rex";
        String expected3 = "Please log in to continue.";
        String expected4 = "Name: Timothy Hogan\nSalutation: Mr\nEmail: tiverdi@tirinfu.mw\nPassword: NFs7Yl";

        accountStandard2.login("LL55WQFNez0rex");
        accountAdministrator2.login("NFs7Yl");
        assertEquals(expected1, accountStandard1.toString());
        assertEquals(expected2, accountStandard2.toString());
        assertEquals(expected3, accountAdministrator1.toString());
        assertEquals(expected4, accountAdministrator2.toString());
    }

    @Test
    void testBalance() {
        int expected1 = 20;
        int expected2 = 15;

        accountStandard1.setBalance(expected1);
        accountStandard2.setBalance(expected2);

        assertEquals(expected1, accountStandard1.getBalance());
        assertEquals(expected2, accountStandard2.getBalance());
    }

    @Test
    void testLogin() {
        accountStandard1.login("HHLY5fc4QCy");
        assertTrue(accountStandard1.getLoggedIn());

        accountStandard2.login("AX0X68laZ6lZ");
        assertEquals(1, accountStandard2.getFailedLoginAttempts());
        accountStandard2.login("emIH8Q2");
        assertEquals(2, accountStandard2.getFailedLoginAttempts());
        accountStandard2.login("f2nKsPignesm3Zkp5");
        assertEquals(3, accountStandard2.getFailedLoginAttempts());
    }

    @Test
    void deposit() {
        int expected1 = 20;
        int expected2 = 15;

        accountStandard1.deposit(expected1);
        accountStandard2.deposit(expected2);

        assertEquals(expected1, accountStandard1.getBalance());
        assertEquals(expected2, accountStandard2.getBalance());
    }

    @Test
    void getBuy() {
        ArrayList<MusicTitle> list1 = new ArrayList<>();

        ArrayList<MusicTitle> list2 = new ArrayList<>();
        list2.add(musicTitle1);
        list2.add(musicTitle2);

        accountStandard1.deposit(15);
        accountStandard1.deposit(2);

        accountStandard1.buy(musicTitle1);
        accountStandard2.buy(musicTitle2);
        accountStandard2.buy(musicTitle1);
        accountStandard2.buy(musicTitle2);

        assertEquals(list1, accountStandard1.getTitlesBought());
        assertEquals(list1, accountStandard2.getTitlesBought());

        accountStandard2.deposit(30);

        accountStandard2.login("LL55WQFNez0rex");
        accountStandard2.buy(musicTitle1);
        accountStandard2.buy(musicTitle2);
        assertEquals(list2, accountStandard2.getTitlesBought());
    }

    @Test
    void getFailedLoginAttempts() {
        assertEquals(0, accountStandard1.getFailedLoginAttempts());
        accountStandard1.login("aq92CBWunjrmZbi6");
        assertEquals(1, accountStandard1.getFailedLoginAttempts());
        accountStandard1.login("SxBlMfzKLBeKX5u6i");
        assertEquals(2, accountStandard1.getFailedLoginAttempts());
    }

    @Test
    void setFailedLoginAttempts() {
        accountStandard1.setFailedLoginAttempts(2);
        assertEquals(2, accountStandard1.getFailedLoginAttempts());

        accountStandard2.setFailedLoginAttempts(5);
        assertEquals(5, accountStandard2.getFailedLoginAttempts());
    }

    @Test
    void testAdminAccounts() {
        accountAdministrator1.addAccount(accountStandard1);
        accountAdministrator2.addAccount(accountStandard1);
        accountAdministrator2.addAccount(accountStandard2);

        ArrayList<Account> list1 = new ArrayList<>();
        list1.add(accountStandard1);

        ArrayList<Account> list2 = new ArrayList<>();
        list2.add(accountStandard1);
        list2.add(accountStandard2);

        assertEquals(list1, accountAdministrator1.getAccounts());
        assertEquals(list2, accountAdministrator2.getAccounts());
    }

    @Test
    void resetAccount() {
        accountAdministrator1.resetAccount(accountStandard1, "3TqDV4jOkxVNHG");
        accountStandard1.login("3TqDV4jOkxVNHG");
        assertFalse(accountStandard1.getLoggedIn());

        accountAdministrator2.login("NFs7Yl");
        accountAdministrator2.resetAccount(accountStandard1, "3TqDV4jOkxVNHG");
        accountStandard1.login("3TqDV4jOkxVNHG");
        assertTrue(accountStandard1.getLoggedIn());
    }
}