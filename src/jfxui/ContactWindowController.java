/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxui;

import db.home.bank.Account;
import db.home.bank.AccountManager;
import db.home.bank.Address;
import db.home.bank.Agency;
import db.home.bank.Bank;
import db.home.bank.Postcode;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * FXML Controller class
 *
 * @author Charlotte
 */
public class ContactWindowController extends ControllerBase {
    @FXML private Label labelBank, labelAgency, labelAddress, labelManager, labelPhone, labelEmail;
    
    @Override
    public void initialize(Mediator mediator) {
    }
    
    public void initContactWindowController(Mediator mediator) {
        EntityManager em = mediator.createEntityManager();
        
        this.labelBank.setText("Bank : " + em.createQuery("SELECT b.name FROM Bank b JOIN b.agencyCollection ag JOIN ag.accountCollection a WHERE a.id = 1", Bank.class).getSingleResult());
        this.labelAgency.setText("Agency : " + em.createQuery("SELECT ag.agencyName FROM Agency ag JOIN ag.accountCollection a WHERE a.id = 1", Agency.class).getSingleResult());  
        this.labelAddress.setText(
                "Address : " 
                + em.createQuery("SELECT ag.idAddress FROM Agency ag JOIN ag.accountCollection a WHERE a.id = 1", Address.class).getSingleResult()
                + "\n                 "
                + em.createQuery("SELECT ad.idPostcode FROM Address ad JOIN ad.agencyCollection ag JOIN ag.accountCollection a WHERE a.id = 1", Postcode.class).getSingleResult());
        this.labelManager.setText(
                "Manager : " 
                + em.createQuery("SELECT am.name FROM AccountManager am JOIN am.idAgency ag JOIN ag.accountCollection a WHERE a.id = 1", AccountManager.class).getSingleResult()
                + " "
                + em.createQuery("SELECT am.firstName FROM AccountManager am JOIN am.idAgency ag JOIN ag.accountCollection a WHERE a.id = 1", AccountManager.class).getSingleResult());
        this.labelPhone.setText(
                "Phone : " 
                + em.createQuery("SELECT am.phone FROM AccountManager am JOIN am.idAgency ag JOIN ag.accountCollection a WHERE a.id = 1", AccountManager.class).getSingleResult());
        this.labelEmail.setText(
                "Email : " 
                + em.createQuery("SELECT am.email FROM AccountManager am JOIN am.idAgency ag JOIN ag.accountCollection a WHERE a.id = 1", AccountManager.class).getSingleResult());
    }
    
}
