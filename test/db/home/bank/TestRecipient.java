/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.home.bank;

import org.junit.Test;
import projetJava.Recipient;
import static org.junit.Assert.*;

/**
 *
 * @author Charlotte
 */
public class TestRecipient {
    // String name, String IBAN
    
    @Test(expected = NullPointerException.class)
    public void testTask_NameIsNull() {
        new Recipient(null, "FR00000000000");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_NameIsEmpty() {
        new Recipient("", "FR00000000000");
    }
    
    @Test(expected = NullPointerException.class)
    public void testTask_IBANIsNull() {
        new Recipient("Mamie", null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTask_IBANIsInvalid() {
        new Recipient("Mamie", "00000000000");
    }

    @Test
    public void testGetRecipient_name() {
        this.tested = new Recipient("Mamie", "FR00000000000");
        assertEquals("Mamie", this.tested.getRecipient_name());
    }

    @Test
    public void testGetRecipient_IBAN() {
        this.tested = new Recipient("Mamie", "FR00000000000");
        assertEquals("FR00000000000", this.tested.getRecipient_IBAN());
    }
    
    private Recipient tested;
}
