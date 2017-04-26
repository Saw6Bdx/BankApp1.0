package projetJava;

import java.util.Calendar;
import java.util.Date;
import utils.Check;

/**
 * Vérifier 
 * @author Mary
 */
public class Holder {

    public Holder(String name, String firstName, Date date, String phone) {
        
        Check.checkIsEmpty(name,"name");
        Check.checkIsEmpty(firstName,"firstName");
        Check.checkIsNull(date,"date");
        if (date.getTime() > today().getTime()) {
           throw new IllegalArgumentException("birthday in the future");
        }
        Check.checkIsEmpty(phone,"phone");
        
        this.name = name;
        this.firstName = firstName;
        this.date = date;
        this.phone = phone;
        
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setAddress(String line1, String line2, String postCode, String city) {
        this.line1 = line1;
        this.line2 = line2;
        this.postCode = postCode;
        this.city = city;
    }
    
    private Date today() {
        return Calendar.getInstance().getTime();
    }
   
    private String name, firstName, phone; 
    private Date date;
    private String line1, line2, postCode, city;
    
    
}
