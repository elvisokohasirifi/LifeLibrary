/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author study
 */
public class ForgotPasswordController implements Initializable {

    @FXML
    private TextField nameTxt;
    @FXML
    private TextField userTxt;
    @FXML
    private Button hintBtn;
    @FXML
    private Label passwordLbl;
    @FXML
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hintPassword(ActionEvent event) {
    }

    @FXML
    private void goBack(ActionEvent event) {
    }
    
}
