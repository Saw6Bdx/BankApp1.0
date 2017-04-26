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
import projetJava.Holder;
import static org.junit.Assert.*;

/**
 *
 * @author Guest
 */
public class TestHolder {
    
    public TestHolder() {
    }
    
    @Before
    public void setUp() {
        Calendar cal = new GregorianCalendar(2017, Calendar.APRIL, 11, 15, 29, 15);
        this.tested = new Holder("foo","bar",cal.getTime(),"0609080706");
    }
    
    
    // Tests sur le constructeur 
    
    @Test(expected = NullPointerException.class)
    public void testHolder_NameIsNull() {
        new Holder(null,"bar",new Date(0),"0609080706");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_NameIsEmpty() {
        new Holder("","bar",new Date(0),"0609080706");
    }
    
    @Test(expected = NullPointerException.class)
    public void testHolder_FirstNameIsNull() {
        new Holder("foo",null,new Date(0),"0609080706");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_FirstNameIsEmpty() {
        new Holder("foo","",new Date(0),"0609080706");
    }
    
    @Test(expected = NullPointerException.class)
    public void testHolder_DateIsNull() {
        new Holder("foo","bar",null,"0609080706");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_CreateDateInTheFuture() {
        new Holder("foo","bar",new GregorianCalendar(2017, Calendar.APRIL, 21, 15, 29, 15).getTime(),"0609080706");
    }
    
    @Test(expected = NullPointerException.class)
    public void testHolder_PhoneIsNull() {
        new Holder("foo","bar",new Date(0),null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_PhoneIsEmpty() {
        new Holder("foo","bar",new Date(0),"");
    }
    
    
    // Tests sur les getters
    
    @Test
    public void testGetName() {
        assertEquals("foo",this.tested.getName());
    }
    
    @Test
    public void testGetFirstName() {
        assertEquals("bar",this.tested.getFirstName());
    }
    
    @Test
    public void testGetDate() {
        assertEquals(
                new GregorianCalendar(2017, Calendar.APRIL, 11, 15, 29, 15).getTime(),
                this.tested.getDate()
        );
    }
    
    @Test
    public void testGetPhone() {
        assertEquals("0609080706",this.tested.getPhone());
    }
    
    private Holder tested;
    
}
