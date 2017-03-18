/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author study
 */
public class LoanBooksController implements Initializable {

    @FXML
    private MenuItem acountLnk;
    @FXML
    private MenuItem addLnk;
    @FXML
    private MenuItem deleteLnk;
    @FXML
    private Button loanBtn;
    @FXML
    private Button backBtn;
    @FXML
    private TextField borrowerName;
    @FXML
    private TextField emailTxt;
    @FXML
    private TextField contactTxt;
    @FXML
    private TextField borrowerId;
    @FXML
    private ComboBox<?> bookBox;
    @FXML
    private Hyperlink logoutLink;
    @FXML
    private MenuItem editBookLink;
    @FXML
    private MenuItem editBorrowerLink;
    @FXML
    private MenuItem searchBookLink;
    @FXML
    private MenuItem searchBorowerLink;
    @FXML
    private MenuItem helpLink;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    /** The goToAccount takes the user to his account profile page
     *
     */
    private void goToAccount(ActionEvent event) {
    }


    @FXML
    /** The addBook takes the user to the add book page
     * to add more books into the database
     */
    private void addBook(ActionEvent event) {
    }

    @FXML
    /** The deleteBook takes the user to the delete book page
     * to remove books from the database
     */
    private void deleteBook(ActionEvent event) {
    }

    @FXML
     /** The loanBook confirms addition of a new borrower into the database  
      * has a dialog box for confirmation 
     */
    private void loanBook(ActionEvent event) {
    }

    @FXML
    /** The goBack takes the user to the main screen page  
     */
    private void goBack(ActionEvent event) {
    }


    @FXML
    /** The logOut method allows the user to exit the program by signing out
     */
    private void logOut(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void editBook(ActionEvent event) {
    }

    @FXML
    private void editBorrower(ActionEvent event) {
    }

    @FXML
    private void searchBook(ActionEvent event) {
    }

    @FXML
    private void searchBorrower(ActionEvent event) {
    }

    @FXML
    private void helpUser(ActionEvent event) {
    }
    
}
