
package projetJava;

/**
 *
 * @author Charlotte
 */
public class Recipient {
    // name VARCHAR(250) NOT NULL,
    // IBAN VARCHAR(250)
    
    public Recipient(String name, String IBAN) {
        
        if(name.isEmpty()) {
            throw new IllegalArgumentException("The name cannot be empty.");
        }
        if(IBAN == null) {
            throw new NullPointerException("The IBAN cannot be null.");
        }
        if(!IBAN.matches("^[A-Z]+[A-Z].*")) {
            throw new IllegalArgumentException("The IBAN must start with two upper letters.");
        }
        
        this.name = name;
        this.IBAN = IBAN;
    }
    
    public String getRecipient_name() {
        return this.name;
    }
    
    public String getRecipient_IBAN() {
        return this.IBAN;
    }
    
    /*public xxx () {
        // supprimer un recipient
    }*/
    
    private String name, IBAN;
}
