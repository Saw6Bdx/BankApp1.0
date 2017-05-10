/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxui;

import db.home.bank.Account;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

/**
 * FXML Controller class
 *
 * @author Charlotte
 */
public class AssignNewHolderController extends ControllerBase {
    @FXML private ChoiceBox<Account> choiceAccount;
    
    @Override
    public void initialize(Mediator mediator) {
        // empty initialization
    }    
    
    @FXML
    private void handleBtnCancel(ActionEvent event) throws IOException {
        
    }
    
    @FXML
    private void handleBtnAssign(ActionEvent event) throws IOException {
        
    }
}
