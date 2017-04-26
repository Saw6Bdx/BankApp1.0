/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.home.bank;

import org.junit.Before;
import org.junit.Test;
import projetJava.Login;
import static org.junit.Assert.*;

/**
 *
 * @author Guest
 */
public class TestLogin {
    
    public TestLogin() {
    }
    
    @Before
    public void setUp() {
        this.tested = new Login("foo","bar");
    }
    
    
    // Tests des constructeurs
    
    @Test(expected = NullPointerException.class)
    public void testLogin_LoginIsNull() {
        new Login(null,"bar");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testLogin_LoginIsEmpty() {
        new Login("","bar");
    }
    
    @Test(expected = NullPointerException.class)
    public void testLogin_PwdIsNull() {
        new Login("foo",null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testLogin_PwdIsEmpty() {
        new Login("foo","");
    }
    
    
    // Tests des getters
    
    @Test
    public void testGetLogin() {
        assertEquals("foo",this.tested.getLogin());
    }
    
    @Test
    public void testGetPwd() {
        assertEquals("bar",this.tested.getPwd());
    }
    
    private Login tested;
}
