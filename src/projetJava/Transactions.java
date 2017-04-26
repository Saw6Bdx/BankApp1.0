/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetJava;

import java.util.Date;
import utils.Check;

/**
 *
 * @author Mary
 */
public class Transactions {
    
    public Transactions(String label, double amount, Date date, Date endDate, 
            int dayNb, String comment, String periodUnit, String transactionType) {
        
        // tester dayNb : int et amount : double ?
        
        Check.checkIsEmpty(label,"label");
        Check.checkIsNull(date,"date");
        Check.checkIsNull(endDate,"endDate");
        Check.checkIsNull(comment,"comment"); // comment can be empty
        Check.checkIsNull(periodUnit,"periodUnit"); // periodUnit can be empty
        Check.checkIsEmpty(transactionType,"transactionType");
        
        this.amount = amount;
        this.dayNb = dayNb;
        
        this.label = label;
        this.date = date;
        this.endDate = endDate;
        this.comment = comment;
        this.periodUnit = periodUnit;
        this.transactionType = transactionType;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public Date getEndDate() {
        return this.endDate;
    }
    
    public String getComment() {
        return this.comment;
    }
    
    public String getPeriodUnit() {
        return this.periodUnit;
    }
    
    public String getTransactionType() {
        return this.transactionType;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
    public int getDayNb() {
        return this.dayNb;
    }
    
    private String label, comment;
    private Date date, endDate;
    private double amount;
    private int dayNb;
    
    private String periodUnit;
    
    private String transactionType;
    
}
