package db.home.bank;

import org.junit.Before;
import org.junit.Test;
import projetJava.Category;
import static org.junit.Assert.*;

public class TestCategory {
    
    @Before
    public void setUp() {
    }
    
    @Test(expected = NullPointerException.class)
    public void testCategory_LabelIsNull(){
        new Category(null); 
    }
    
    @Test
    public void testGetCategory(){
        this.tested = new Category("foo");
        assertEquals("foo", this.tested.getCategory());
    }
    
    private Category tested;
}
