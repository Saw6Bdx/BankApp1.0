package jfxui;

import db.home.bank.Transactions;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Nicolas
 */
public class TransactionsWindowController extends ControllerBase{
    @FXML private TableView<Transactions> listTransactions;
    @FXML private ChoiceBox<String> monthChooser;
    
    private int flagAccount;
    
    /**
     * Method which assigns the flagAccount id under mouse_clicked in AppWindow to this.flagAccount
     * @param flagAccount id under mouse_clicked
     */
    public void setFlagAccount(int flagAccount) {
        this.flagAccount = flagAccount;
    }
    
    @Override
    public void initialize(Mediator mediator){       
        this.monthChooser.getItems().addAll("Month...", "January", "February", "March", "April", "May", "June", "July",  "August", "September", "October", "November", "December");
        //this.monthChooser.getItems().addAll(Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, Calendar.JUNE, Calendar.JULY, Calendar.AUGUST, Calendar.SEPTEMBER, Calendar.OCTOBER, Calendar.NOVEMBER, Calendar.DECEMBER);
        
        //TypedQuery<Transactions> q = em.createQuery("SELECT t FROM Transactions t WHERE t.idAccount.id =:acc AND t.", Transactions.class);
        //this.monthChooser.setItems(FXCollections.observableList(q.setParameter("acc",  1).getResultList()));
        
    }
    
    public void initTransactionsWindowController(Mediator mediator){
        EntityManager em = mediator.createEntityManager();
        TypedQuery<Transactions> q = em.createQuery("SELECT t FROM Transactions t WHERE t.idAccount.id =:acc", Transactions.class);
        this.listTransactions.setItems(FXCollections.observableList(q.setParameter("acc", this.flagAccount).getResultList()));
        em.close();
    }

}
