/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetJava;

import utils.Check;

/**
 *
 * @author Mary
 */
public class Address {
 
    public Address(String line1, String line2, String postCode, String city) {
       
        Check.checkIsEmpty(line1,"line1");
        Check.checkIsNull(line2,"line2"); // line2 can be empty
        Check.checkIsEmpty(postCode,"postCode");
        Check.checkIsEmpty(city,"city");
        
        this.line1 = line1;
        this.line2 = line2;
        this.postCode = postCode;
        this.city = city;
    }
    
    public String getLine1(){
        return this.line1;
    }
    
    public String getLine2(){
        return this.line2;
    }
    
    public String getPostCode(){
        return this.postCode;
    }
    
    public String getCity(){
        return this.city;
    }
    
    private String line1, line2, postCode, city;
    
}