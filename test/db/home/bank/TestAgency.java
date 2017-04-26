package db.home.bank;

import org.junit.Before;
import org.junit.Test;
import projetJava.Agency;
import static org.junit.Assert.*;

public class TestAgency {
    
    @Before
    public void setUp() {
    }

    @Test(expected = NullPointerException.class)
    public void testAgency_BankNameIsNull(){
        new Agency(null, "foo", "bar", "foo2"); 
    }
    
    @Test(expected = NullPointerException.class)
    public void testAgency_BankCodeIsNull(){
        new Agency("foo", null, "bar", "foo2"); 
    }
    
    @Test(expected = NullPointerException.class)
    public void testAgency_AgencyNameIsNull(){
        new Agency("foo", "bar", null, "foo2");
    }
    
    @Test(expected = NullPointerException.class)
    public void testAgency_AgencyCodeIsNull(){
        new Agency("foo", "bar", "foo2", null); 
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAgency_BankNameIsEmpty(){
        new Agency("", "foo", "bar", "foo2"); 
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAgency_BankCodeIsEmpty(){
        new Agency("foo", "", "bar", "foo2"); 
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAgency_AgencyNameIsEmpty(){
        new Agency("foo", "bar", "", "foo2");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAgency_AgencyCodeIsEmpty(){
        new Agency("foo", "bar", "foo2", ""); 
    }
    
    @Test
    public void testGetBankName(){
        this.tested = new Agency("foo", "bar", "foo2", "bar2");
        assertEquals("foo", this.tested.getBankName());
    }
    
    @Test
    public void testGetBankCode(){
        this.tested = new Agency("foo", "bar", "foo2", "bar2");
        assertEquals("bar", this.tested.getBankCode());
    }
    
    @Test
    public void testGetAgencyName(){
        this.tested = new Agency("foo", "bar", "foo2", "bar2");
        assertEquals("foo2", this.tested.getAgencyName());
    }
    
    @Test
    public void testGetAgencyCode(){
        this.tested = new Agency("foo", "bar", "foo2", "bar2");
        assertEquals("bar2", this.tested.getAgencyCode());
    }
    
    private Agency tested;
}
