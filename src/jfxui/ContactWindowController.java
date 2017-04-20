/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javax.persistence.EntityManager;

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
                
        labelBank.setText("Bank : ");
        labelAgency.setText("Agency : ");
        labelAddress.setText("Address : ");
        labelManager.setText("Manager : ");
        labelPhone.setText("Phone : ");
        labelEmail.setText("Email : ");
        //TypedQuery<Transactions> q = em.createQuery("SELECT t FROM Transactions t WHERE t.idAccount.id =:acc", Transactions.class);
        //q.setParameter("acc", 2).getResultList();
        //List<Agency> agency = em.createQuery("SELECT a FROM Agency a", Agency.class).getResultList();
        //List<Transactions> calendar = em.createQuery("SELECT ");
        // Remplissage du tableview avec transactions
        //this.monthChooser.setItems(FXCollections.observableList(calendar));
	//this.listAgency.setItems(FXCollections.observableList(agency));
        //this.listTransactions.setItems(FXCollections.observableList(q));
    }
    
}
