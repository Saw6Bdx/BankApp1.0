package projetJava;

import java.util.Calendar;
import java.util.Date;

public class Account {
    public Account(String number, Date creationDate, String type, String countryCode, double firstBalance, double overdraft, String description, double interestRate){
        if(number.isEmpty()){
            throw new IllegalArgumentException("number can't be empty");
        }
        if(creationDate == null){
            throw new NullPointerException("creationDate can't be null");
        }
        if(creationDate.getTime() > today().getTime()){
            throw new IllegalArgumentException("creationDate in the future");
	}
        if(type.isEmpty()){
            throw new IllegalArgumentException("type can't be empty");
        }
        if(countryCode.isEmpty()){
            throw new IllegalArgumentException("countryCode can't be empty");
        }        
        if(description == null){
            throw new NullPointerException("description can't be null");
        }
        
        this.number = number;
        this.creationDate = creationDate;
        this.type = type;
        this.countryCode = countryCode;
        this.firstBalance = firstBalance;
        this.overdraft = overdraft;
        this.description = description;
        this.interestRate = interestRate;
    }
   
    public String getNumber(){
        return this.number;
    }
    
    public Date getDate(){
        return this.creationDate;
    }
    
    public String getType(){
        return this.type;
    }
    
    public String getCountryCode(){
        return this.countryCode;
    }
    
    public Double getFirstBalance(){
        return this.firstBalance;
    }
    
    public double getOverdraft(){
        return this.overdraft;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public double getInterestRate(){
        return this.interestRate;
    }
    
    /*public createAccount(){
       Add to Bdd 
    }*/
    
    private Date today(){
	return Calendar.getInstance().getTime();
    }
    
    private String number, description, type, countryCode;
    private Date creationDate;
    private double firstBalance, overdraft, interestRate;
}