
package projetJava;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Charlotte
 */
public class AccountManager {
    /*  name VARCHAR(250) NOT NULL,
	firstName VARCHAR(250) NOT NULL,
	phone VARCHAR(250),
	email VARCHAR(250),
	assignementDate DATE NOT NULL,*/
    
    public AccountManager(String name, String firstName, String phone, String email, Date assignementDate) {
        
        if(name.isEmpty()) {
            throw new IllegalArgumentException("The name cannot be empty.");
        }
        if(firstName.isEmpty()) {
            throw new IllegalArgumentException("The firstName cannot be empty.");
        }
        if(phone == null) {
            throw new NullPointerException("The phone cannot be null.");
        }
        if(!phone.matches("[0-9]+")) {
            throw new IllegalArgumentException("The phone number must contain only numbers.");
        }
        if(email == null) {
            throw new NullPointerException("The email cannot be null.");
        }
        if(!email.matches(".*+@+.*")) {
            throw new IllegalArgumentException("The email address must contain an @.");
        }
        if(assignementDate == null) {
            throw new NullPointerException("The assignementDate cannot be null.");
        }
        if(assignementDate.getTime()>today().getTime()) {
            throw new IllegalArgumentException("assignementDate cannot be in the future.");
        }
        
        this.name = name;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.assignementDate = assignementDate;
    }
    
    public String getManager_name() {
        return this.name;
    }
    public String getManager_firstName() {
        return this.firstName;
    }
    public String getManager_phone() {
        return this.phone;
    }
    public String getManager_email() {
        return this.email;
    }
    public Date getManager_assignementDate() {
        return this.assignementDate;
    }
    
    private Date today() {
        return Calendar.getInstance().getTime();
    }
    
    private String name;
    private String firstName;
    private String phone;
    private String email;
    private Date assignementDate;
}
