/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.home.bank;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Before;
import org.junit.Test;
import projetJava.Transactions;
import static org.junit.Assert.*;

/**
 *
 * @author Guest
 */
public class TestTransactions {
    
    public TestTransactions() {
    }
    
    @Before
    public void setUp() {
        Calendar cal = new GregorianCalendar(2017, Calendar.APRIL, 11, 15, 29, 15);
        this.tested = new Transactions("foo",2.0,cal.getTime(),cal.getTime(),2,"bar","hebdo","CB");
    }
    
    // Tests des constructeurs
    @Test(expected = NullPointerException.class)
    public void testTransactions_LabelIsNull() {
        new Transactions(null,2.0,new Date(0),new Date(0),2,"bar","hebdo","CB");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransactions_LabelIsEmpty() {
        new Transactions("",2.0,new Date(0),new Date(0),2,"bar","hebdo","CB");
    }
    
    @Test(expected = NullPointerException.class)
    public void testTransactions_DateIsNull() {
        new Transactions("foo",2.0,null,new Date(0),2,"bar","hebdo","CB");
    }
    
    /*@Test(expected = IllegalArgumentException.class)
    public void testTransactions_DateIsEmpty() {
        new Transactions("foo",2.0,"",new Date(0),2,"bar","hebdo","CB");
    }*/
    
    @Test(expected = NullPointerException.class)
    public void testTransactions_EndDateIsNull() {
        new Transactions("foo",2.0,new Date(0),null,2,"bar","hebdo","CB");
    }
    
    /*@Test(expected = IllegalArgumentException.class)
    public void testTransactions_EndDateIsEmpty() {
        new Transactions("foo",2.0,new Date(0),"",2,"bar","hebdo","CB");
    }*/
    
    @Test(expected = NullPointerException.class)
    public void testTransactions_CommentIsNull() {
        new Transactions("foo",2.0,new Date(0),new Date(0),2,null,"hebdo","CB");
    }
    
    @Test(expected = NullPointerException.class)
    public void testTransactions_PeriodUnitIsNull() {
        new Transactions("foo",2.0,new Date(0),new Date(0),2,"bar",null,"CB");
    }
    
    @Test(expected = NullPointerException.class)
    public void testTransactions_TransactionTypeIsNull() {
        new Transactions("foo",2.0,new Date(0),new Date(0),2,"bar","hebdo",null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransactions_TransactionTypeIsEmpty() {
        new Transactions("foo",2.0,new Date(0),new Date(0),2,"bar","hebdo","");
    }
    
    
    // Tests des getters
    
    @Test
    public void testGetLabel() {
        assertEquals("foo",this.tested.getLabel());
    }
    
    @Test
    public void testGetAmount() {
        assertEquals(2.0,this.tested.getAmount(),0.0);
    }
    
    @Test
    public void testGetDate() {
        assertEquals(
                new GregorianCalendar(2017, Calendar.APRIL, 11, 15, 29, 15).getTime(),
                this.tested.getDate()
        );
    }
    
    @Test
    public void testGetEndDate() {
        assertEquals(
                new GregorianCalendar(2017, Calendar.APRIL, 11, 15, 29, 15).getTime(),
                this.tested.getEndDate()
        );
    }
    
    @Test
    public void testGetDayNb() {
        assertEquals(2,this.tested.getDayNb());
    }
    
    @Test
    public void testGetComment() {
        assertEquals("bar",this.tested.getComment());
    }
    
    @Test
    public void testGetPeriodUnit() {
        assertEquals("hebdo",this.tested.getPeriodUnit());
    }
    
    @Test
    public void testGetTransactionType() {
        assertEquals("CB",this.tested.getTransactionType());
    }
    
    private Transactions tested;
    
}
