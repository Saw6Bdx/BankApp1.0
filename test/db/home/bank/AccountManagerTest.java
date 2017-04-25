
package db.home.bank;

import db.home.bank.AccountManager;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charlotte
 */
public class AccountManagerTest {
    /*  name VARCHAR(250) NOT NULL,
	firstName VARCHAR(250) NOT NULL,
	phone VARCHAR(250),
	email VARCHAR(250),
	assignementDate DATE NOT NULL,*/
    
    @Test(expected = NullPointerException.class)
    public void testTask_NameIsNull() {
        new AccountManager(1, null, "bar", new Date(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_NameIsEmpty() {
        new AccountManager(1, "", "bar", new Date(0));
    }
    
    @Test(expected = NullPointerException.class)
    public void testTask_FirstNameIsNull() {
        new AccountManager(1, "foo", null, new Date(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_FirstNameIsEmpty() {
        new AccountManager(1, "foo", "",  new Date(0));
    }
    
    @Test(expected = NullPointerException.class)
    public void testTask_DateIsNull() {
        new AccountManager(1, "foo", "bar", null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_assignementDateInTheFuture() {
        new AccountManager(1, "foo", "bar", new GregorianCalendar(2017, Calendar.JULY, 10, 12, 31, 15).getTime());
    }

    @Test(expected = NullPointerException.class)
    public void testTask_PhoneIsNull() {
        this.tested = new AccountManager(1, "foo", "bar", new Date(0));
        this.tested.setPhone(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_PhoneIsInvalid() {
        this.tested = new AccountManager(1, "foo", "bar", new Date(0));
        this.tested.setPhone("00000H0000");
    }
    
    @Test(expected = NullPointerException.class)
    public void testTask_EmailIsNull() {
        this.tested = new AccountManager(1, "foo", "bar", new Date(0));
        this.tested.setEmail(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_EmailIsInvalid() {
        this.tested = new AccountManager(1, "foo", "bar", new Date(0));
        this.tested.setEmail("foo.bar foobar.fr");
    }
    
    @Test
    public void testGetManager_name() {
        this.tested = new AccountManager(1, "foo", "bar", new Date(0));
        assertEquals("foo", this.tested.getName());
    }

    @Test
    public void testGetManager_firstName() {
        this.tested = new AccountManager(1, "foo", "bar", new Date(0));
        assertEquals("bar", this.tested.getFirstName());
    }

    @Test
    public void testGetManager_phone() {
        this.tested = new AccountManager(1, "foo", "bar", new Date(0));
        this.tested.setPhone("0000000000");
        assertEquals("0000000000", this.tested.getPhone());
    }

    @Test
    public void testGetManager_email() {
        this.tested = new AccountManager(1, "foo", "bar", new Date(0));
        this.tested.setEmail("foo.bar@foobar.fr");
        assertEquals("foo.bar@foobar.fr", this.tested.getEmail());
    }

    @Test
    public void testGetManager_assignementDate() {
        this.tested = new AccountManager(1, "foo", "bar", new GregorianCalendar(2017, Calendar.APRIL, 10, 12, 31, 15).getTime());
        assertEquals(new GregorianCalendar(2017, Calendar.APRIL, 10, 12, 31, 15).getTime(), this.tested.getAssignementDate());
    }
    
    private AccountManager tested;
}
